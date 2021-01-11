use newservlet2020;

CREATE TABLE account (
  idaccount bigint NOT NULL PRIMARY KEY auto_increment,
  tentaikhoan varchar(100) NOT NULL,
  matkhau varchar(100) NOT NULL,
  tenkhachhang varchar(100) NULL,
  sodienthoai varchar(20) NULL,
  trangthai int NOT NULL,
  roleid bigint NOT NULL,
  modifieddate timestamp NULL,
  createddate timestamp NULL,
  createdby varchar(255) NULL,
  modifiedby varchar(255) NULL
);

CREATE TABLE dongiaodich (
  iddongiaodich bigint NOT NULL PRIMARY KEY auto_increment,
  tenkhachhang varchar(50) NULL,
  ngayxuatdon date NULL,
  idpetphobien bigint NOT NULL,
  idhoanthanh bigint NOT NULL,
  createddate timestamp NULL,
  modifieddate timestamp NULL,
  createdby varchar(255) NULL,
  modifiedby varchar(255) NULL
);

CREATE TABLE giong (
  idgiong bigint NOT NULL PRIMARY KEY auto_increment,
  tengiong varchar(50) NULL,
  idloai bigint NOT NULL,
  createddate timestamp NULL,
  modifieddate timestamp NULL,
  createdby varchar(255) NULL,
  modifiedby varchar(255) NULL
  );

CREATE TABLE hoanthanh (
  tinhtrang varchar(10) NULL,
  iddongiaodich bigint NOT NULL,
  idhoanthanh bigint NOT NULL PRIMARY KEY auto_increment,
  createddate timestamp NULL,
  modifieddate timestamp NULL,
  createdby varchar(255) NULL,
  modifiedby varchar(255) NULL
);

CREATE TABLE loai (
  idloai bigint NOT NULL PRIMARY KEY auto_increment,
  tenloai varchar(20)  NULL,
  code varchar(100) NOT NULL,
  createddate timestamp NULL,
  modifieddate timestamp NULL,
  createdby varchar(255) NULL,
  modifiedby varchar(255) NULL
);

CREATE TABLE pet (
  idpet bigint NOT NULL PRIMARY KEY auto_increment,
  tieude varchar(100) NULL,
  ten varchar(100)NULL,
  gia float DEFAULT NULL,
  idgiong bigint NOT NULL,
  gioitinh varchar(10) NULL,
  tuoi int(11) DEFAULT NULL,
  tiemchung varchar(10) NULL,
  baohanhsuckhoe varchar(10) NULL,
  idaccount bigint NOT NULL,
  sodienthoai decimal(10,0) NULL,
  diachi varchar(200)  NULL,
  hinhanh varchar(10) NULL,
  idhoanthanh bigint NOT NULL,
  createddate timestamp NULL,
  modifieddate timestamp NULL,
  createdby varchar(255)  NULL,
  modifiedby varchar(255)  NULL
);

CREATE TABLE petphobien (
  idpetPhoBien bigint NOT NULL PRIMARY KEY auto_increment,
  soluong int(20) NULL,
  createddate timestamp NULL,
  modifieddate timestamp NULL,
  createdby varchar(255)  NULL,
  modifiedby varchar(255) NULL
);

CREATE TABLE role (
  id bigint NOT NULL PRIMARY KEY auto_increment,
  name varchar(255) NOT NULL,
  code varchar(255) NOT NULL,
  createddate timestamp NULL,
  modifieddate timestamp NULL,
  createdby varchar(255) NULL,
  modifiedby varchar(255) NULL
);

ALTER TABLE account ADD CONSTRAINT fk_account_role FOREIGN KEY (roleid) REFERENCES role(id);
ALTER TABLE pet ADD CONSTRAINT fk_pet_account FOREIGN KEY (idaccount) REFERENCES account(idaccount);
ALTER TABLE pet ADD CONSTRAINT fk_pet_giong FOREIGN KEY (idgiong) REFERENCES giong(idgiong);
ALTER TABLE pet ADD CONSTRAINT fk_pet_hoanthanh FOREIGN KEY (idhoanthanh) REFERENCES hoanthanh(idhoanthanh);
ALTER TABLE hoanthanh ADD CONSTRAINT fk_hoanthanh_dongiaodich FOREIGN KEY (iddongiaodich) REFERENCES dongiaodich(iddongiaodich);
ALTER TABLE dongiaodich ADD CONSTRAINT fk_dongiaodich_petphobien FOREIGN KEY (idpetphobien) REFERENCES petphobien(idpetphobien);
ALTER TABLE giong ADD CONSTRAINT fk_giong_loai FOREIGN KEY (idloai) REFERENCES loai(idloai);