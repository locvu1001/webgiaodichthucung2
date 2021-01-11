package com.laptrinhjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.IAccountDAO;
import com.laptrinhjavaweb.model.AccountModel;
import com.laptrinhjavaweb.model.GiongModel;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.IAccountService;

public class AccountService implements IAccountService {
	
	@Inject
	private IAccountDAO accountDAO;


	@Override
	public AccountModel findByTendangnhapAndMatkhauAndTrangthai(String tentaikhoan, String matkhau, Integer trangthai) {
		return accountDAO.findByTendangnhapAndMatkhauAndTrangthai(tentaikhoan, matkhau, trangthai);
	}


	@Override
	public List<GiongModel> findByIdLoai(Long idLoai) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public GiongModel save(GiongModel giongModel) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public GiongModel update(GiongModel updateGiong) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<GiongModel> findAll(Pageble pageble) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public GiongModel findOne(long idgiong) {
		// TODO Auto-generated method stub
		return null;
	}

}
