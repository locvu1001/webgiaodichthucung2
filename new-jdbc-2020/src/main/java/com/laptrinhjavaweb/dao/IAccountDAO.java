package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.model.AccountModel;

public interface IAccountDAO extends GenericDAO<AccountModel> {
	AccountModel findByTendangnhapAndMatkhauAndTrangthai(String tentaikhoan, String matkhau, Integer trangthai );
}
