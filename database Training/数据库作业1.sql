
-- ------------database------------------
show databases;
select database();


create database if not exists lecture_training_test1 character set 'UTF8';
show create database lecture_training_test1;

drop database lecture_training_test1 ;
drop database if exists lecture_training_test1;
use lecture_training_test1;


create table if not exists Users(
userId int auto_increment,       
name varchar(20) not null,
email varchar(20),
institute varchar(20),
INSERT_ID varchar(20),   /*插入的人*/
INSERT_TS timestamp,   /*插入的时间*/
UPDATE_ID varchar(20),   /*更新的人*/
UPDATE_TS timestamp,   /*更新的时间*/
 primary key(userId)
)engine=innodb charset=utf8 auto_increment=1000;
insert into Users(name, email, institute, INSERT_ID, INSERT_TS)
value('张甲汶','1608216534@qq.com', '信息科学与工程学院', "张甲汶", current_timestamp());
desc users;
show create table users;
select * from users;

create table if not exists product(
productId int auto_increment,       
productName varchar(20) not null,
Size int,
Price varchar(20),
INSERT_ID varchar(20),   /*插入的人*/
INSERT_TS timestamp,   /*插入的时间*/
UPDATE_ID varchar(20),   /*更新的人*/
UPDATE_TS timestamp,   /*更新的时间*/
 primary key(productId)
)engine=innodb charset=utf8 auto_increment=1000;
insert into product(productName,Size,Price, INSERT_ID, INSERT_TS)
value('苹果', 12,'5', "张甲汶", current_timestamp());
desc product;
select * from product;

create table if not exists trade(
tradeId int auto_increment,       
ClientName varchar(20) not null,
Ticker varchar(20),
RIC varchar(20),
productId int ,
INSERT_ID varchar(20),   /*插入的人*/
INSERT_TS timestamp,   /*插入的时间*/
UPDATE_ID varchar(20),   /*更新的人*/
UPDATE_TS timestamp,   /*更新的时间*/
 primary key(tradeId)
)engine=innodb charset=utf8 auto_increment=1000;
insert into trade(ClientName,Ticker,RIC,INSERT_ID, INSERT_TS)
value('张甲汶', 'wen','5', "张甲汶", current_timestamp());
select * from trade;