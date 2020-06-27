--MYSQL
CREATE TABLE `users` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `userid` varchar(45) NOT NULL,
  `name` varchar(50) NOT NULL,
  `surname` varchar(15) NOT NULL,
  `fathername` varchar(45) DEFAULT NULL,
  `gender` varchar(4) NOT NULL,
  `dob` date NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(150) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phonenumber` bigint(20) NOT NULL,
  `landnumber` bigint(20) DEFAULT NULL,
  `role` varchar(20) NOT NULL,
  `village` varchar(45) DEFAULT NULL,
  `address` text NOT NULL,
  `createdby` smallint(6) DEFAULT NULL,
  `createddate` datetime DEFAULT NULL,
  `updatedby` smallint(6) DEFAULT NULL,
  `updateddate` datetime DEFAULT NULL,
  `status` varchar(5) DEFAULT NULL,
  `enabled` tinyblob,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  UNIQUE KEY `userid_UNIQUE` (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

CREATE TABLE `user_authority` (
  `user_id` int(11) NOT NULL,
  `authority_id` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `authority` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO users (id, userid,username, password, name, surname, email, phonenumber, enabled, updateddate,gender,dob,role,address) VALUES (1, 'user','user', '$2a$04$Vbug2lwwJGrvUXTj6z7ff.97IzVBkrJ1XfApfGNl.Z695zqcnPYra', 'Fan', 'Jin', 'user@example.com', '+1234567890', true,  (SELECT CURDATE()),'M',(SELECT CURDATE()), 'ROLE_USER','');
INSERT INTO users (id, userid,username, password, name, surname, email, phonenumber, enabled, updateddate,gender,dob,role,address) VALUES (2, 'admin','admin', '$2a$04$Vbug2lwwJGrvUXTj6z7ff.97IzVBkrJ1XfApfGNl.Z695zqcnPYra', 'Jing', 'Xiao', 'admin@example.com', '+0987654321', true,  (SELECT CURDATE()),'M',(SELECT CURDATE()), 'ROLE_ADMIN','');

INSERT INTO authority (id, name) VALUES (1, 'ROLE_USER');
INSERT INTO authority (id, name) VALUES (2, 'ROLE_ADMIN');

INSERT INTO user_authority (user_id, authority_id) VALUES (1, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (2, 1);





