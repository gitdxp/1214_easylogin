drop database if exists easylogin;
create database easylogin default character set utf8;
use easylogin;

#create user table
create table t_user(
	user_id int auto_increment primary key,
	user_name varchar(30),
	password varchar(32),
	credits int,
	last_visit datetime,
	last_ip varchar(23)
)engine=innodb;

#create user log table
create table t_login_lgo(
	login_log_id int auto_increment primary key,
	user_id int,
	ip varchar(23),
	login_datetime datetime
)engine=innodb;

#insert data
insert into t_user (user_name,password) values
 ('root','root');
commit;

