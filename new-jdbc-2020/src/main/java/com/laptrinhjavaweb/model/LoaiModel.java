package com.laptrinhjavaweb.model;

public class LoaiModel extends AbstractModel<LoaiModel> {
	private Long idloai;
	private String tenloai;
	private String code;
	public Long getIdloai() {
		return idloai;
	}
	public void setIdloai(Long idloai) {
		this.idloai = idloai;
	}
	public String getTenloai() {
		return tenloai;
	}
	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
