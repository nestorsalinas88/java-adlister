package config;

public class Config {

//    We need to set our thing up
    private static String url ;
    private static String username;
    private static String password ;

    public static String getPassword() {
        return password;
    }

    public static String getUrl() {
        return url;
    }

    public static String getUsername() {
        return username;
    }
}