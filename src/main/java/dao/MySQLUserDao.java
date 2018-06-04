package dao;

import java.sql.*;

public class MySQLUserDao implements Users{
private Connection connection;

public MySQLUserDao(Config config){
    try{
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    } catch(SQLException e){
        throw new RuntimeException("Error connecting to database");
    }
}

@Override
public User findByUsername(String username) {
    String query = "SELECT * FROM users WHERE username = ? LIMIT 1";
    try {
        PreparedStatement statement = connection.prepareStatement(query);
        statement,setString(1,username);
        return extractUser(statement.executeQuery());

    } catch (SQLException e){
        throw new RuntimeException("Error finding username", e);
    }

}


@Override

}
