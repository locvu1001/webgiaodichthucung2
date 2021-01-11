package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.model.PetModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface IPetService {
	List<PetModel> findByCategoryId(Long idLoai);
	PetModel save(PetModel newModel);
	PetModel update(PetModel updateNew);
	void delete(long[] ids);
	List<PetModel> findAll(Pageble pageble);
	int getTotalItem();
	PetModel findOne(long idPet);
}
