package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.PetModel;

public class PetMapper implements RowMapper<PetModel> {
	@Override
	public PetModel mapRow(ResultSet resultSet) {
		try {
			PetModel news = new PetModel();
			news.setIdPet(resultSet.getLong("idpet"));
			news.setTieude(resultSet.getString("tieude"));
			news.setIdLoai(resultSet.getLong("idloai"));
			news.setHinhanh(resultSet.getString("hinhanh"));
			news.setDiachi(resultSet.getString("diachi"));
			news.setCreatedDate(resultSet.getTimestamp("createddate"));
			news.setCreatedBy(resultSet.getString("createdby"));
			if (resultSet.getTimestamp("modifieddate") != null) {
				news.setModifiedDate(resultSet.getTimestamp("modifieddate"));
			}
			if (resultSet.getString("modifiedby") != null) {
				news.setModifiedBy(resultSet.getString("modifiedby"));
			}
			return news;
		} catch (SQLException e) {
			return null;
		}	
	}
}
