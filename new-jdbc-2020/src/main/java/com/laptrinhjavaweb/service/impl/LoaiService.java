package com.laptrinhjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.ILoaiDAO;
import com.laptrinhjavaweb.model.LoaiModel;
import com.laptrinhjavaweb.service.ILoaiService;

public class LoaiService implements ILoaiService{
	
	@Inject
	private ILoaiDAO categoryDao;

	@Override
	public List<LoaiModel> findAll() {
		return categoryDao.findAll();
	}
	
}
