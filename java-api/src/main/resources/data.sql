INSERT INTO users (user_id,name, email,role) VALUES (1,'Admin', 'admin@gmail.com','ADMIN');
INSERT INTO users (user_id,name, email,role) VALUES (2,'Aditya', 'aditya@gmail.com','user');
INSERT INTO users (user_id,name, email,role) VALUES (3,'Aayush', 'aayush@gmail.com','user');
INSERT INTO users (user_id,name, email,role) VALUES (4,'Askhat', 'akshat@gmail.com','user');
INSERT INTO users (user_id,name, email,role) VALUES (5,'Adesh', 'adesh@gmail.com','user');

INSERT INTO books (book_id,name) Values (1,'bonds_2019');
INSERT INTO books (book_id,name) Values (2,'bonds_2020');
INSERT INTO books (book_id,name) values (3,'bonds_2021');
INSERT INTO books (book_id,name) values (4,'bonds_2022');
INSERT INTO books (book_id,name) values (5,'bonds_2018');

INSERT INTO book_user VALUES (2,1);
INSERT INTO book_user VALUES (2,2);
INSERT INTO book_user VALUES (3,1);
INSERT INTO book_user VALUES (3,2);

INSERT INTO trades (id,quantity,status,price,BUYSELL,TRADEDATE,SETTLEMENTDATE) VALUES (1,5,'completed',100,'buy','2019-12-01','2021-01-01');
INSERT INTO trades (id,quantity,status,price,BUYSELL,TRADEDATE,SETTLEMENTDATE) VALUES (2,10,'incomplete',200,'sell','2019-11-01','2021-02-01');
INSERT INTO trades (id,quantity,status,price,BUYSELL,TRADEDATE,SETTLEMENTDATE) VALUES (3,15,'in-progess',300,'buy','2019-10-01','2021-03-01');
INSERT INTO trades (id,quantity,status,price,BUYSELL,TRADEDATE,SETTLEMENTDATE) VALUES (4,20,'completed',400,'sell','2019-09-01','2021-04-01');
INSERT INTO trades (id,quantity,status,price,BUYSELL,TRADEDATE,SETTLEMENTDATE) VALUES (5,25,'incomplete',500,'buy','2019-08-01','2021-05-01');

INSERT INTO securities (id,ISIN,CUSIP,issuer,maturityDate,coupon,type,faceValue,status) VALUES (1,'abc','hef','rahul','2019-12-01','THANKYOU200','ASDD',100,'MATURED');
INSERT INTO securities (id,ISIN,CUSIP,issuer,maturityDate,coupon,type,faceValue,status) VALUES (2,'def','rhe','aakash','2019-11-01','THANKYOU100','ASDD',200,'IMMATURE');
INSERT INTO securities (id,ISIN,CUSIP,issuer,maturityDate,coupon,type,faceValue,status) VALUES (3,'feg','fjt','aastha','2019-10-01','THANKYOU400','ASDD',300,'MATURED');
INSERT INTO securities (id,ISIN,CUSIP,issuer,maturityDate,coupon,type,faceValue,status) VALUES (4,'grd','ijo','aakarshi','2019-09-01','THANKYOU700','ASDD',400,'IMMATURE');
INSERT INTO securities (id,ISIN,CUSIP,issuer,maturityDate,coupon,type,faceValue,status) VALUES (5,'teg','opl','chirag','2019-08-01','THANKYOU200','ASDD',500,'MATURED');


INSERT INTO counter_party values (1,'counterparty1');
INSERT INTO counter_party values (2,'counterparty2');

-- book_id,security_id,counterparty_id
-- update trades set book_id=1,security_id=1,counterparty_id=1 where id=1;
-- update trades set book_id=1,security_id=1,counterparty_id=1 where id=2;
-- update trades set book_id=2,security_id=2,counterparty_id=2 where id=3;
-- update trades set book_id=3,security_id=2,counterparty_id=1 where id=4;
-- update trades set book_id=2,security_id=3,counterparty_id=2 where id=5;