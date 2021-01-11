package com.laptrinhjavaweb.model;

public class GiongModel extends AbstractModel<GiongModel> {
	private Long idgiong;
	private String tengiong;
	private Long idloai;
	private String loaiCode;
	private long[] ids;
	public Long getIdgiong() {
		return idgiong;
	}
	public void setIdgiong(Long idgiong) {
		this.idgiong = idgiong;
	}
	public String getTengiong() {
		return tengiong;
	}
	public void setTengiong(String tengiong) {
		this.tengiong = tengiong;
	}
	public Long getIdloai() {
		return idloai;
	}
	public void setIdloai(Long idloai) {
		this.idloai = idloai;
	}
	public long[] getIds() {
		return ids;
	}
	public void setIds(long[] ids) {
		this.ids = ids;
	}

	public String getLoaiCode() {
		return loaiCode;
	}

	public void setLoaiCode(String loaiCode) {
		this.loaiCode = loaiCode;
	}
}
