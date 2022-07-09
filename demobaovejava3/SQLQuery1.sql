create database demobaove
go
use demobaove
go
drop table sinhvien
go
create table sinhvien
(
MASV varchar(30),
Tensv nvarchar(50),
ngaysinh date,
sodt varchar(50),
gioitinh bit,
diachi varchar(50)
)
go

insert into sinhvien
values('SV001',N'nguyễn đình thắng ','2002/08/23','0123456789','true','ha tinh'),
('SV002',N'lê thị thiên ','2009/08/23','0123456789','false','ha tinh'),
('SV003',N'trương tam phong','2001/08/23','0123456789','true','ha tinh');
select * from sinhvien