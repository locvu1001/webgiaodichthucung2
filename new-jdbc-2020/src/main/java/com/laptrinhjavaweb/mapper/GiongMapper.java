package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.GiongModel;

public class GiongMapper implements RowMapper<GiongModel> {

	@Override
	public GiongModel mapRow(ResultSet resultSet) {
		try {
			GiongModel giong = new GiongModel();
			giong.setIdgiong(resultSet.getLong("idgiong"));
			giong.setTengiong(resultSet.getString("tengiong"));
			giong.setIdloai(resultSet.getLong("idloai"));
			giong.setCreatedDate(resultSet.getTimestamp("createddate"));
			giong.setCreatedBy(resultSet.getString("createdby"));
			if(resultSet.getTimestamp("modifieddate") != null) {
				giong.setModifiedDate(resultSet.getTimestamp("modifieddate"));
			}
			if(resultSet.getString("modifiedby") != null) {
				giong.setModifiedBy(resultSet.getString("modifiedby"));
			}
			return giong;
		} catch (SQLException e) {
			return null;
		}
		
	}

}
