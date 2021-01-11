package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.GiongModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface IGiongDAO extends GenericDAO<GiongModel> {
	GiongModel findOne(Long idgiong);
	List<GiongModel> findByIdLoai(Long idLoai);
	Long save (GiongModel giongModel);
	void update(GiongModel updateGiong);
	void delete(long id);
	List<GiongModel> findAll(Pageble pageble);
	int getTotalItem();
}
