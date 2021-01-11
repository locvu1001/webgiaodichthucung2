package com.laptrinhjavaweb.model;

public class HoanthanhModel extends AbstractModel<HoanthanhModel> {
	private Long idHoanthanh;
	private String Tinhtrang;
	private String idDongiaodich;
	public Long getIdHoanthanh() {
		return idHoanthanh;
	}
	public void setIdHoanthanh(Long idHoanthanh) {
		this.idHoanthanh = idHoanthanh;
	}
	public String getTinhtrang() {
		return Tinhtrang;
	}
	public void setTinhtrang(String tinhtrang) {
		Tinhtrang = tinhtrang;
	}
	public String getIdDongiaodich() {
		return idDongiaodich;
	}
	public void setIdDongiaodich(String idDongiaodich) {
		this.idDongiaodich = idDongiaodich;
	}
	
}
