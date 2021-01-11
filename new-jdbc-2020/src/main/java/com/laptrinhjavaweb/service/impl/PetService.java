package com.laptrinhjavaweb.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.ILoaiDAO;
import com.laptrinhjavaweb.dao.IpetDAO;
import com.laptrinhjavaweb.model.LoaiModel;
import com.laptrinhjavaweb.model.PetModel;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.IPetService;

public class PetService implements IPetService{
	
	@Inject
	private IpetDAO newDao;

	@Inject
	private ILoaiDAO categoryDAO;

	@Override
	public List<PetModel> findByCategoryId(Long idLoai) {
		return newDao.findByCategoryId(idLoai);
	}

	@Override
	public PetModel save(PetModel newModel) {
		newModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		LoaiModel category = categoryDAO.findOneByCode(newModel.getCategoryCode());
		newModel.setIdLoai(category.getIdloai());
		Long newId = newDao.save(newModel);
		return newDao.findOne(newId);
	}

	@Override
	public PetModel update(PetModel updateNew) {
		PetModel oldNew = newDao.findOne(updateNew.getIdPet());
		updateNew.setCreatedDate(oldNew.getCreatedDate());
		updateNew.setCreatedBy(oldNew.getCreatedBy());
		updateNew.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		LoaiModel category = categoryDAO.findOneByCode(updateNew.getCategoryCode());
		updateNew.setIdLoai(category.getIdloai());
		newDao.update(updateNew);
		return newDao.findOne(updateNew.getIdPet());
	}

	@Override
	public void delete(long[] ids) {
		for (long id: ids) {
			newDao.delete(id);
		}
	}

	@Override
	public List<PetModel> findAll(Pageble pageble) {
		return newDao.findAll(pageble);
	}

	@Override
	public int getTotalItem() {
		return newDao.getTotalItem();
	}

    @Override
    public PetModel findOne(long idPet) {
    	PetModel newModel = newDao.findOne(idPet);
		LoaiModel categoryModel = categoryDAO.findOne(newModel.getIdLoai());
		newModel.setCategoryCode(categoryModel.getCode());
        return newModel;
    }
}
