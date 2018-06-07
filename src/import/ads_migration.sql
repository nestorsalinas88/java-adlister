DROP DATABASE ad_lister_db;
CREATE DATABASE adlister_db;

USE adlister_db;

DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS ads;

CREATE TABLE user(
  id INT unsigned NOT NULL AUTO_INCREMENT,
  username VARCHAR(240) NOT NULL,
  email VARCHAR(50),
  password VARCHAR(20),
  PRIMARY KEY (id)

);

CREATE TABLE ads(
  id INT unsigned NOT NULL AUTO_INCREMENT,
  user_id INT UNSIGNED NOT NULL,
  title VARCHAR(50) NOT NULL ,
  description VARCHAR(140) NOT NULL ,
  category VARCHAR (100) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES user(id)
    ON DELETE CASCADE

);
