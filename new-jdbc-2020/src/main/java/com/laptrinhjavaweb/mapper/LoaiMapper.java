package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.LoaiModel;

public class LoaiMapper implements RowMapper<LoaiModel> {

	@Override
	public LoaiModel mapRow(ResultSet resultSet) {
		try {
			LoaiModel loai = new LoaiModel();
			loai.setIdloai(resultSet.getLong("idloai"));
			loai.setCode(resultSet.getString("code"));
			loai.setTenloai(resultSet.getString("tenloai"));
			return loai;
		} catch (SQLException e) {
			return null;
		}
	}
}
