create database QLSINHVIEN
GO
use QLSINHVIEN

create table STUDENTS
(
MaSV nvarchar(50) not null primary key,
 HoTen nvarchar(50) ,
Email nvarchar(50),
SoDT nvarchar(12),
GioiTinh bit,
Diachi nvarchar(100)
)

insert into STUDENTS
values('SV001',N'lê văn phùng ','phunglv@fpt.edu.vn','0863827492','True',N'ninh thuận'),
('SV002',N'nguyễn đình thắng ','thangnd@fpt.edu.vn','0263923648','True',N'hà tĩnh ') ,
('SV003',N'lê thị hà ','halt@fpt.edu.vn','0863835245','False',N'cà mau') ,
('SV004',N'nguyễn thị loan ','loannt@fpt.edu.vn','0863827434','False',N'quận 12') ;
select * from STUDENTS