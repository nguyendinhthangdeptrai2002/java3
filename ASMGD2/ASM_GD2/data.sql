CREATE DATABASE ASMJAVA_3
use ASMJAVA_3
go
drop table  STUDENT
create table STUDENT
(
MASV nvarchar(50)  PRIMARY KEY,
	
Hoten nvarchar(50),
Email nvarchar(50),
SoDT nvarchar(15),
Gioitinh bit ,
Diachi nvarchar(50),
Hinh nvarchar(50)
)


drop table DRADE
create table DRADE
(
ID int identity not null,
MASV nvarchar(50)
references STUDENT(MASV),
Tienganh int ,
Tinhoc int ,
GDTC int 
)
go


drop table USERS
create table USERS 
(
username nvarchar(50) not null primary key,
password nvarchar(50),
role nvarchar(50)
)
DROP table STUDENT
INSERT INTO STUDENT
VALUES  
('SV008',N'NGUY?N V?N   TRaI','tranv@gmail.com','0335560732','True','ha noi','no1.jpg'),
('SV001',' NGUYEN VAN TEO','teonv@gmail.com','0359780733','True','3311 no thang long','o1.PNG'),

('SV006',N'NGUY?N V?N   TR?I','troinv@gmail.com','0335730732','True','ha noi','abc.PNG'),

('SV002','  LE THI OI ','oilt@gmail.com','0578780733','True','319 nam ki khoi nghia_ha noi','ca.jpg'),
('SV003',' NGUYEN THI CU','cut@gmail.com','0359456733','False','222 no thang long','mo.jpg'),
('SV004',' LE PHUNG HIEU KIEN','kienlp@gmail.com','0359739482','False','222 cmt8','mo2.jpg'),
('SV005',N'NGUY?N ?ÌNH TH?NG','th?ngnd@gmail.com','0359747324','False','3311 ha tinh ','ong4.PNG'),
('SV007',N' NGUY?N DU','du@gmail.com','0359347233','True','vung tau','o1.PNG');
delete from STUDENT where MASV='SV004'

delete from DRADE where MASV ='sv009'
select *from STUDENT

insert into DRADE
VALUES ('SV001',8,8,8),
('SV002',9,9,9),
('SV003',7,7,7),
('SV004',8,9,9),
('SV005',6,7,7),
('SV006',8,8,9),
('SV007',7,9,5),
('SV008',3,4,9);

SELECT * FROM DRADE
DELETE TABLE DRADE WHERE

INSERT INTO USERS
VALUES ( 'Hanh',321,N'cán bộ đào tạo '),
( 'Hieu',123,N'giảng viên '),
( 'Thang',321,N'giảng viên '),
( 'Trung',123,N'cán bộ đào tạo ');

select * from USERS
