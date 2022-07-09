use KidszonSchool
drop  table Students
create table Students
 (
Regid int identity  primary key,
Name nvarchar(50),
Address nvarchar(50),
ParentName nvarchar(50),
Phone  nvarchar(50),
RegDate datetime,
standard nvarchar(50)
references Standars(standard)
)
go
select * from Students

 drop table Standars
create table Standars
(
standard nvarchar(50) not null primary key,
Regid int	

)
Select * from Standars
select * from Students
insert into Students
values ('nguyen dinh thang','ha tinh','nguyen dinh long','0359780733',1900-04-03,'gioi')

insert into Standars 
values ( N'khá','001'),
(N'giỏi','002'),
(N'yếu','003');