CREATE TABLE User
( userId INT NOT NULL ,
  userName varchar(30) NOT NULL,
  password varchar(15) NOT NULL,
  firstName varchar(50) ,
  lastName varchar(50),
  email varchar(50) NOT NULL,
  type varchar(4),
  PRIMARY KEY (userId)
);