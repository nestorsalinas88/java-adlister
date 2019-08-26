USE adlister_db;

INSERT INTO users(
username, email, password
)

VALUES
('userguy','jake@gmail.com', 'password1'),
('userdude','brian@gmail.com', 'password1'),
('userman','john@gmail.com', 'password1');


INSERT INTO ads(
user_id, title, description, category
)
VALUES
(3 ,'bike for sale', 'super awesome bike', 'for rent'),
(2, 'couch for rent', 'awesome couch ', 'for sale'),
(1, 'move special', 'a moving give away', 'for rent');

