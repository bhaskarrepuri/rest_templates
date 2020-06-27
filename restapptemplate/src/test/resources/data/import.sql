INSERT INTO users (id, userid,username, password, name, surname, email, phonenumber, enabled, updateddate,gender,dob,role,address,fathername,village) VALUES (1, 'user','user', '$2a$04$Vbug2lwwJGrvUXTj6z7ff.97IzVBkrJ1XfApfGNl.Z695zqcnPYra', 'Fan', 'Jin', 'user@example.com', '9063350484', true,  (SELECT CURDATE()),'M',(SELECT CURDATE()), 'ROLE_USER','','','');
INSERT INTO users (id, userid,username, password, name, surname, email, phonenumber, enabled, updateddate,gender,dob,role,address,fathername,village) VALUES (2, 'admin','admin', '$2a$04$Vbug2lwwJGrvUXTj6z7ff.97IzVBkrJ1XfApfGNl.Z695zqcnPYra', 'Jing', 'Xiao', 'admin@example.com', '+0987654321', true,  (SELECT CURDATE()),'M',(SELECT CURDATE()), 'ROLE_ADMIN','','','');

INSERT INTO authority (id, name) VALUES (1, 'ROLE_USER');
INSERT INTO authority (id, name) VALUES (2, 'ROLE_ADMIN');

INSERT INTO user_authority (user_id, authority_id) VALUES (1, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (2, 1);