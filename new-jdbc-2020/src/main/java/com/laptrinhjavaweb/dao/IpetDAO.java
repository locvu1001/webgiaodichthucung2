package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.PetModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface IpetDAO extends GenericDAO<PetModel>{
	PetModel findOne(Long idPet);
	List<PetModel> findByCategoryId(Long categoryId);
	Long save(PetModel newModel);
	void update(PetModel updateNew);
	void delete(long idPet);
	List<PetModel> findAll(Pageble pageble);
	int getTotalItem();
}
