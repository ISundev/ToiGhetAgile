Create database Agile_Nhom6
go
use Agile_Nhom6
go
create table TaiKhoan(
	TenDangNhap varchar(20) not null primary key,
	MatKhau varchar(20) not null,
	VaiTro nvarchar(20) not null
)
create table SinhVien(
	MaSV varchar(20) not null primary key,
	TenDangNhap varchar(20),
	TenSV nvarchar(40),
	NgaySinh date,
	GioiTinh BIT,
	DiaChi varchar(40),
	Email varchar(30),
	SDT varchar(15),
	Anh varchar(300),
	FOREIGN KEY(TenDangNhap) REFERENCES TaiKhoan(TenDangNhap)
)
create table GiangVien(
	MaGV varchar(10) not null primary key,
	TenDangNhap varchar(20),
	TenGV nvarchar(40),
	NgaySinh date,
	GioiTinh BIT,
	DiaChi varchar(40),
	Email varchar(30),
	SDT varchar(15),
	Anh varchar(300),
	FOREIGN KEY(TenDangNhap) REFERENCES TaiKhoan(TenDangNhap)
)
create table MonHoc(
	MaMH varchar(10) not null primary key,
	TenMH varchar(20),

)