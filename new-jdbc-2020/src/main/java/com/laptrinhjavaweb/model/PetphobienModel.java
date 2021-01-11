package com.laptrinhjavaweb.model;

public class PetphobienModel extends AbstractModel<PetphobienModel> {
	private Long idPetphobien;
	private int Soluong;
	public Long getIdPetphobien() {
		return idPetphobien;
	}
	public void setIdPetphobien(Long idPetphobien) {
		this.idPetphobien = idPetphobien;
	}
	public int getSoluong() {
		return Soluong;
	}
	public void setSoluong(int soluong) {
		Soluong = soluong;
	}
	
}
