package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.laptrinhjavaweb.dao.IpetDAO;
import com.laptrinhjavaweb.mapper.PetMapper;
import com.laptrinhjavaweb.model.PetModel;
import com.laptrinhjavaweb.paging.Pageble;



public class PetDAO extends AbstractDAO<PetModel> implements IpetDAO{

	@Override
	public List<PetModel> findByCategoryId(Long idLoai) {
		String sql = "SELECT * FROM pet WHERE idloai = ?";
		return query(sql, new PetMapper(), idLoai);
	}

	@Override
	public Long save(PetModel newModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO pet (tieude, ");
		sql.append(" hinhanh, diachi, idloai, createddate, createdby)");
		sql.append(" VALUES(?, ?, ?, ?, ?, ?)");
		return insert(sql.toString(), newModel.getTieude(),
				newModel.getHinhanh(), newModel.getDiachi(), newModel.getIdLoai(),
				newModel.getCreatedDate(), newModel.getCreatedBy());
	}

	@Override
	public PetModel findOne(Long idPet) {
		String sql = "SELECT * FROM pet WHERE idpet = ?";
		List<PetModel> news = query(sql, new PetMapper(), idPet);
		return news.isEmpty() ? null : news.get(0);
	}

	@Override
	public void update(PetModel updateNew) {
		StringBuilder sql = new StringBuilder("UPDATE pet SET tieude = ?, hinhanh = ?,");
		sql.append(" diachi = ?, idloai = ?,");
		sql.append(" createddate = ?, createdby = ?, modifieddate = ?, modifiedby = ? WHERE id = ?");
		update(sql.toString(), updateNew.getTieude(), updateNew.getHinhanh(), updateNew.getDiachi(),
				updateNew.getIdLoai(), updateNew.getCreatedDate(), 
				updateNew.getCreatedBy(), updateNew.getModifiedDate(), 
				updateNew.getModifiedBy(), updateNew.getIdPet());
	}

	@Override
	public void delete(long idPet) {
		String sql = "DELETE FROM pet WHERE idpet = ?";
		update(sql, idPet);
	}

	@Override
	public List<PetModel> findAll(Pageble pageble) {
		StringBuilder sql = new StringBuilder("SELECT * FROM pet");
		if (pageble.getSorter() != null && StringUtils.isNotBlank(pageble.getSorter().getSortName()) && StringUtils.isNotBlank(pageble.getSorter().getSortBy())) {
			sql.append(" ORDER BY "+pageble.getSorter().getSortName()+" "+pageble.getSorter().getSortBy()+"");
		}
		if (pageble.getOffset() != null && pageble.getLimit() != null) {
			sql.append(" LIMIT "+pageble.getOffset()+", "+pageble.getLimit()+"");
		}
		return query(sql.toString(), new PetMapper());
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM pet";
		return count(sql);
	}

}
