package dao;

import com.mysql.cj.jdbc.Driver;
import models.Ad;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection = null;

    public MySQLAdsDao(){
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/movies_db?serverTimezone=UTC&useSSL=false",
                    "movies_user",
                    "password"
            );

        } catch (SQLException e){
            throw new RuntimeException("Error connecting to database",e);
        }
    }

    @Override
    public List<Ad> all() {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("SELECT * FROM ads");
            ResultSet result = statement.executeQuery();
            return createAdsFromResults(result);
        } catch (SQLException e){
            throw new RuntimeException("Error finding username", e);
        }

    }


    @Override
    public Long insert(Ad ad){
        try{
            String insertQuery = "INSERT INTO ads(ad_id, ad_title, ad_description VALUES (?,?,?)";
            PreparedStatement statement = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
            statement.setLong(1, ad.getUserId());
            statement.setString(2, ad.getTitle());
            statement.setString(3, ad.getDescription());
            statement.executeUpdate();
            ResultSet result = statement.getGeneratedKeys();
            result.next();
            return result.getLong(1);
        } catch(SQLException e){
            throw new RuntimeException("Error creating an ad", e);
        }
    }

    private Ad extractAd(ResultSet result) throws SQLException{
        return new Ad(
                result.getLong("ad_id"),
                result.getLong("ad_title"),
                result.getString("ad_description"),
                result.getString("description")
        );
    }


    private List<Ad> createAdsFromResults(ResultSet result) throws SQLException{
        List<Ad> ads = new ArrayList<>();
        while (result.next()){
            ads.add(extractAd(result));
        }
        return ads;
    }






}
