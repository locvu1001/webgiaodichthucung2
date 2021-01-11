package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.dao.ILoaiDAO;
import com.laptrinhjavaweb.mapper.LoaiMapper;
import com.laptrinhjavaweb.model.LoaiModel;

public class LoaiDAO extends AbstractDAO<LoaiModel> implements ILoaiDAO {

	@Override
	public List<LoaiModel> findAll() {
		String sql = "SELECT * FROM loai";
		return query(sql, new LoaiMapper());
	}

	@Override
	public LoaiModel findOne(long id) {
		String sql = "SELECT * FROM loai WHERE idloai = ?";
		List<LoaiModel> category = query(sql, new LoaiMapper(), id);
		return category.isEmpty() ? null : category.get(0);
	}

    @Override
    public LoaiModel findOneByCode(String code) {
		String sql = "SELECT * FROM loai WHERE code = ?";
		List<LoaiModel> category = query(sql, new LoaiMapper(), code);
		return category.isEmpty() ? null : category.get(0);
    }

}
