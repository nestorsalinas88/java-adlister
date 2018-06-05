//package dao;
//
//import models.User;
//import sun.security.krb5.Config;
//
//import java.sql.*;
//import java.util.List;
//
//public class MySQLUsersDao implements Users{
//private Connection connection = null;
//
//public MySQLUsersDao(Config config){
//    try{
//        DriverManager.registerDriver(new Driver());
//        connection = DriverManager.getConnection(
//                "jdbc:mysql://localhost/movies_db?serverTimezone=UTC&useSSL=false",
//                "movies_user",
//                "password"
//        );
//    } catch(SQLException e){
//        throw new RuntimeException("Error connecting to database", e);
//    }
//}
//
//
//    public List<User> findByUsername(String username){
//        String query = "SELECT * FROM users WHERE username = ? LIMIT 1";
//        try{
//            PreparedStatement statement = connection.prepareStatement(query);
//            statement.setString(1, username);
//            return extractUser(statement.executeQuery());
//        } catch (SQLException e){
//            throw new RuntimeException("Error finding user");
//        }
//    }
//
//
//
//
//    @Override
//    public Long insert(User user){
//    String query = "INSERT INTO users(username, email, password) VALUES (?,?,?)";
//    try{
//        PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
//        statement.setString(1, user.getUsername());
//        statement.setString(2, user.getEmail());
//        statement.setString(3, user.getPassword());
//        statement.executeQuery();
//
//        ResultSet result = statement.getGeneratedKeys();
//        result.next();
//        return result.getLong(1);
//    } catch (SQLException e ){
//        throw new RuntimeException("Error creating new user", e);
//    }
//}
//    private List<User> extractUser(ResultSet result) throws SQLException {
//    if(! result.next()) {
//        return null;
//    }
//    return  List<User>(
//            result.getLong("id"),
//            result.getString("username"),
//            result.getString("email"),
//            result.getString("password")
//    );
//
//    }
//
//}
