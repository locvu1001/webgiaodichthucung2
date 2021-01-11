package com.laptrinhjavaweb.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.IGiongDAO;
import com.laptrinhjavaweb.dao.ILoaiDAO;
import com.laptrinhjavaweb.model.GiongModel;
import com.laptrinhjavaweb.model.LoaiModel;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.IGiongService;

public class GiongService implements IGiongService {
	
	@Inject
	private IGiongDAO giongDao;

	@Inject
	private ILoaiDAO loaiDAO;

	@Override
	public List<GiongModel> findByIdLoai(Long idLoai) {
		return giongDao.findByIdLoai(idLoai);
	}

	@Override
	public GiongModel save(GiongModel giongModel) {
		giongModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		Long newId = giongDao.save(giongModel);
		return giongDao.findOne (newId);
	}

	@Override
	public GiongModel update(GiongModel updateGiong) {
		GiongModel oldGiong = giongDao.findOne(updateGiong.getIdgiong());
		updateGiong.setCreatedDate(oldGiong.getCreatedDate());
		updateGiong.setCreatedBy(oldGiong.getCreatedBy());
		updateGiong.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		giongDao.update(updateGiong);
		return giongDao.findOne (updateGiong.getIdgiong());
	}

	@Override
	public void delete(long[] ids) {
		for (long id:ids) {
			
			
			giongDao.delete(id);
		}
	}

	@Override
	public List<GiongModel> findAll(Pageble pageble) {
		return giongDao.findAll(pageble);
	}

	@Override
	public int getTotalItem() {
		return giongDao.getTotalItem();
	}

    @Override
    public GiongModel findOne(long idgiong) {
    	GiongModel giongModel = giongDao.findOne(idgiong);
    	LoaiModel loaiModel = loaiDAO.findOne(giongModel.getIdloai());
    	giongModel.setLoaiCode(loaiModel.getCode());
		return giongModel;
	}
}
