create database email
use email
drop table users
create table users
(
id int,
tentk varchar(50),
tk varchar(50),
mk varchar(50)
)

insert into  users
values ('01','thang long','taolathang@gmail.com','haha'),
('02',N'ong cao thắng','thanglatao@gmail.com','hihi')
	
select mk from users where  tk ='taolathang@gmail.com'