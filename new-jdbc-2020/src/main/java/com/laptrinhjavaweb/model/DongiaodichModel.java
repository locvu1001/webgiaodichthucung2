package com.laptrinhjavaweb.model;

import java.sql.Timestamp;

public class DongiaodichModel extends AbstractModel<DongiaodichModel> {
	private Long idDongiaodich;
	private String tenkhachhang;
	private Timestamp ngayxuatdon;
	private Long idPetphobien;
	private Long idHoanthanh;
	public Long getIdDongiaodich() {
		return idDongiaodich;
	}
	public void setIdDongiaodich(Long idDongiaodich) {
		this.idDongiaodich = idDongiaodich;
	}
	public String getTenkhachhang() {
		return tenkhachhang;
	}
	public void setTenkhachhang(String tenkhachhang) {
		this.tenkhachhang = tenkhachhang;
	}
	public Timestamp getNgayxuatdon() {
		return ngayxuatdon;
	}
	public void setNgayxuatdon(Timestamp ngayxuatdon) {
		this.ngayxuatdon = ngayxuatdon;
	}
	public Long getIdPetphobien() {
		return idPetphobien;
	}
	public void setIdPetphobien(Long idPetphobien) {
		this.idPetphobien = idPetphobien;
	}
	public Long getIdHoanthanh() {
		return idHoanthanh;
	}
	public void setIdHoanthanh(Long idHoanthanh) {
		this.idHoanthanh = idHoanthanh;
	}
	
}
