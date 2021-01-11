package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.LoaiModel;

public interface ILoaiDAO extends GenericDAO<LoaiModel> {
	List<LoaiModel> findAll();
	LoaiModel findOne(long id);
	LoaiModel findOneByCode(String code);
}
