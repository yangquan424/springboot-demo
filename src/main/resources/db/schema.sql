
CREATE TABLE exam (
  id int(11) NOT NULL AUTO_INCREMENT,
  question varchar(255) DEFAULT NULL,
  A varchar(255) DEFAULT NULL,
  B varchar(255) DEFAULT NULL,
  C varchar(255) DEFAULT NULL,
  D varchar(255) DEFAULT NULL,
  answer varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

CREATE TABLE student (
  id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(255) DEFAULT NULL,
  password varchar(255) DEFAULT NULL,
  correct int(11) DEFAULT NULL,
  error int(11) DEFAULT NULL,
  miss int(11) DEFAULT NULL,
  scores int(11) DEFAULT NULL,
  pass varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

CREATE TABLE users (
  id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(255) DEFAULT NULL,
  password varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;