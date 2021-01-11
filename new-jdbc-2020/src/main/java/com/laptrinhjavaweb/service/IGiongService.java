package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.model.GiongModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface IGiongService {
	List<GiongModel> findByIdLoai(Long idLoai);
	GiongModel save(GiongModel giongModel);
	GiongModel update(GiongModel updateGiong);
	void delete (long[] ids);
	List<GiongModel> findAll(Pageble pageble);
	int getTotalItem();
	GiongModel findOne(long idgiong);
}
