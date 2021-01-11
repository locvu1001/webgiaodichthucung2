package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.dao.IGiongDAO;
import com.laptrinhjavaweb.mapper.GiongMapper;
import com.laptrinhjavaweb.model.GiongModel;
import com.laptrinhjavaweb.paging.Pageble;

public class GiongDAO extends AbstractDAO<GiongModel> implements IGiongDAO {

	@Override
	public List<GiongModel> findByIdLoai(Long idLoai) {
		String sql = "SELECT * FROM giong WHERE idloai =?";
		return query(sql, new GiongMapper(), idLoai);
	}

	@Override
	public Long save(GiongModel giongModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO giong(tengiong,");
		sql.append("idloai, createddate, createdby)");
		sql.append("VALUES(?, ?, ?, ?)");
		return insert(sql.toString(), giongModel.getTengiong(), 
				giongModel.getIdloai(), giongModel.getCreatedDate(), giongModel.getCreatedBy());
	}

	@Override
	public GiongModel findOne(Long idgiong) {
		String sql = "SELECT * FROM giong WHERE idgiong = ?";
		List<GiongModel> giong = query(sql, new GiongMapper(), idgiong);
		return giong.isEmpty() ? null : giong.get(0);
	}

	@Override
	public void update(GiongModel updateGiong) {
		StringBuilder sql = new StringBuilder("UPDATE giong SET tengiong = ? ,");
		sql.append("idloai = ? ,");
		sql.append("createddate = ?, createdby = ?, modifieddate = ?, modifiedby = ? WHERE idgiong= ?");
		update(sql.toString(), updateGiong.getTengiong(), updateGiong.getIdloai(),
				updateGiong.getCreatedDate(), updateGiong.getCreatedBy() ,
				updateGiong.getModifiedDate(),updateGiong.getModifiedBy() , updateGiong.getIdgiong());
	}

	@Override
	public void delete(long id) {
		String sql = "DELETE FROM giong WHERE idgiong = ?";
		update(sql,id);
	}

	@Override
	public List<GiongModel> findAll(Pageble pageble) {
		StringBuilder sql = new StringBuilder("SELECT * FROM giong");
		if(pageble.getSorter() != null) {
			sql.append("ORDER BY "+pageble.getSorter().getSortName()+" "+pageble.getSorter().getSortBy()+"");
		}
		if(pageble.getOffset() != null && pageble.getLimit() != null) {
			sql.append(" LIMIT "+pageble.getOffset()+", "+pageble.getLimit()+"");
		}
		return query(sql.toString(), new GiongMapper());
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM giong";
		return count(sql);
	}
}
