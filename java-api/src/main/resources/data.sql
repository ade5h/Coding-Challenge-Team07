INSERT INTO users (user_id,name, password, email,role) VALUES (1,'Admin', 'admin123', 'admin@gmail.com','ADMIN');
INSERT INTO users (user_id,name, password, email,role) VALUES (2,'Aditya','admin123',  'aditya@gmail.com','user');
INSERT INTO users (user_id,name, password, email,role) VALUES (3,'Aayush','admin123',  'aayush@gmail.com','user');
INSERT INTO users (user_id,name, password, email,role) VALUES (4,'Askhat','admin123',  'akshat@gmail.com','user');
INSERT INTO users (user_id,name, password, email,role) VALUES (5,'Adesh','admin123',  'adesh@gmail.com','user');

INSERT INTO books (book_id,name) Values (1,'bonds_2019');
INSERT INTO books (book_id,name) Values (2,'bonds_2020');
INSERT INTO books (book_id,name) values (3,'bonds_2021');
INSERT INTO books (book_id,name) values (4,'bonds_2022');
INSERT INTO books (book_id,name) values (5,'bonds_2018');

INSERT INTO book_user VALUES (2,1);
INSERT INTO book_user VALUES (2,2);
INSERT INTO book_user VALUES (3,1);
INSERT INTO book_user VALUES (3,2);

INSERT INTO trades (id,quantity,status,price,BUYSELL,TRADEDATE,SETTLEMENTDATE) VALUES (1,5,'Success',100,'buy','2022-05-01','2022-05-04');
INSERT INTO trades (id,quantity,status,price,BUYSELL,TRADEDATE,SETTLEMENTDATE) VALUES (2,10,'Success',200,'sell','2022-05-04','2022-05-06');
INSERT INTO trades (id,quantity,status,price,BUYSELL,TRADEDATE,SETTLEMENTDATE) VALUES (3,15,'Success',300,'buy','2022-06-05','2022-06-07');
INSERT INTO trades (id,quantity,status,price,BUYSELL,TRADEDATE,SETTLEMENTDATE) VALUES (4,20,'Fail',400,'sell','2022-07-11','2022-07-13');
INSERT INTO trades (id,quantity,status,price,BUYSELL,TRADEDATE,SETTLEMENTDATE) VALUES (5,25,'Success',500,'buy','2022-07-21','2022-07-22');
INSERT INTO trades (id,quantity,status,price,BUYSELL,TRADEDATE,SETTLEMENTDATE) VALUES (6,5,'Success',100,'buy','2022-05-01','2022-05-04');
INSERT INTO trades (id,quantity,status,price,BUYSELL,TRADEDATE,SETTLEMENTDATE) VALUES (7,10,'Success',200,'sell','2022-05-04','2022-05-06');
INSERT INTO trades (id,quantity,status,price,BUYSELL,TRADEDATE,SETTLEMENTDATE) VALUES (8,15,'Success',300,'buy','2022-06-05','2022-06-07');
INSERT INTO trades (id,quantity,status,price,BUYSELL,TRADEDATE,SETTLEMENTDATE) VALUES (9,20,'Fail',400,'sell','2022-07-11','2022-07-13');
INSERT INTO trades (id,quantity,status,price,BUYSELL,TRADEDATE,SETTLEMENTDATE) VALUES (10,25,'Success',500,'buy','2022-07-21','2022-07-22');

INSERT INTO securities (id,ISIN,CUSIP,issuer,maturityDate,coupon,type,faceValue,status) VALUES (8,'US6949181045','337833100','Microsoft','2022-12-01','7.12','Corporate',100,'NOT REDEEMED');
INSERT INTO securities (id,ISIN,CUSIP,issuer,maturityDate,coupon,type,faceValue,status) VALUES (9,'US7947261045','265765100','Alphabet','2022-08-05','8.01','Corporate',200,'NOT REDEEMED');
INSERT INTO securities (id,ISIN,CUSIP,issuer,maturityDate,coupon,type,faceValue,status,user_user_id) VALUES (10,'US7946687045','989599100','Apple','2022-07-25','7.89','Corporate',300,'REDEEMED',3);
INSERT INTO securities (id,ISIN,CUSIP,issuer,maturityDate,coupon,type,faceValue,status,user_user_id) VALUES (11,'US9978691045','876311100','Amazon','2023-02-10','8.18','Corporate',400,'NOT REDEEMED',4);
INSERT INTO securities (id,ISIN,CUSIP,issuer,maturityDate,coupon,type,faceValue,status) VALUES (12,'US4999281045','280986100','Walmart','2023-04-20','9.00','Corporate',500,'NOT REDEEMED');
INSERT INTO securities (id,ISIN,CUSIP,issuer,maturityDate,coupon,type,faceValue,status) VALUES (13,'US8947781045','244325400','Deutsche Bank','2022-08-12','8.81','Corporate',500,'NOT REDEEMED');
INSERT INTO securities (id,ISIN,CUSIP,issuer,maturityDate,coupon,type,faceValue,status) VALUES (14,'US2942345045','332789600','Goldman Sachs','2022-06-09','7.69','Corporate',500,'REDEEMED');
INSERT INTO securities (id,ISIN,CUSIP,issuer,maturityDate,coupon,type,faceValue,status) VALUES (15,'US2941234045','142756790','Myntra','2022-07-30','7.81','Corporate',900,'NOT REDEEMED');
INSERT INTO securities (id,ISIN,CUSIP,issuer,maturityDate,coupon,type,faceValue,status) VALUES (16,'US2946789045','432788760','AirBnb','2022-08-02','8.89','Corporate',300,'NOT REDEEMED');
INSERT INTO securities (id,ISIN,CUSIP,issuer,maturityDate,coupon,type,faceValue,status) VALUES (17,'US5944562045','782789908','GoPro','2023-05-09','8.91','Corporate',400,'REDEEMED');


INSERT INTO counter_party values (1,'counterparty1');
INSERT INTO counter_party values (2,'counterparty2');

-- book_id,security_id,counterparty_id
update trades set book_book_id=1,security_id=8,counter_party_counter_party_id=1 where id=1;
update trades set book_book_id=1,security_id=9,counter_party_counter_party_id=1 where id=2;
update trades set book_book_id=2,security_id=8,counter_party_counter_party_id=2 where id=3;
update trades set book_book_id=3,security_id=8,counter_party_counter_party_id=1 where id=4;
update trades set book_book_id=2,security_id=8,counter_party_counter_party_id=2 where id=5;
update trades set book_book_id=1,security_id=9,counter_party_counter_party_id=1 where id=6;
update trades set book_book_id=1,security_id=10,counter_party_counter_party_id=1 where id=7;
update trades set book_book_id=2,security_id=10,counter_party_counter_party_id=2 where id=8;
update trades set book_book_id=3,security_id=11,counter_party_counter_party_id=1 where id=9;
update trades set book_book_id=2,security_id=12,counter_party_counter_party_id=2 where id=10;




