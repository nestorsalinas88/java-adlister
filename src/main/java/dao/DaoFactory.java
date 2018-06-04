package dao;


import sun.security.krb5.Config;

public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao;
    private static Config config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }

    public static Users getUserDao(){
        if (usersDao == null){
            usersDao = new MySQLUserDao(config);
        }
        return usersDao;
    }

}
