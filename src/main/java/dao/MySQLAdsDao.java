package dao;

import com.mysql.cj.jdbc.Driver;
import config.Config;
import model.Ad;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException{
        DriverManager.registerDriver(new Driver());
        try {
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        }catch(SQLException e){
            throw new IllegalStateException("Error connecting to the server", e);
        }
    }


// fetching query
    @Override
    public List<Ad> all(){
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM ads");
            return createAdsFromResults(result);
        } catch (SQLException e){
            throw new RuntimeException("error retriving all ads", e);
        }

    }

//    creating array for query
    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(extractAd(rs));
        }
        return ads;
    }


//    arrainging the array's details in the Ad object
    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getString("description"),
                rs.getString("category")
        );
    }


    @Override
    public Long insert(Ad ad) {

        try{
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);
            ResultSet result = stmt.getGeneratedKeys();
            result.next();
            return  result.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("error dude", e);

        }
    }

    private String createInsertQuery(Ad ad) {
        return "INSERT INTO ads(user_id, title, description, category) VALUES "
                + "(" + ad.getUserId() + ", "
                + "'" + ad.getTitle() +"', "
                + "'" + ad.getDescription() + "', "
                + "'" + ad.getCategory() + "')";
    }




}
