package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.dao.IAccountDAO;
import com.laptrinhjavaweb.mapper.AccountMapper;
import com.laptrinhjavaweb.model.AccountModel;

public class AccountDAO extends AbstractDAO<AccountModel> implements IAccountDAO {

	@Override
	public AccountModel findByTendangnhapAndMatkhauAndTrangthai(String tentaikhoan, String matkhau, Integer trangthai) {
		StringBuilder sql = new StringBuilder("SELECT * FROM account  AS a");
		sql.append(" INNER JOIN role AS r ON r.id = a.roleid");
		sql.append(" WHERE tentaikhoan = ? AND matkhau = ? AND trangthai = ?");
		List<AccountModel> accounts = query(sql.toString(), new AccountMapper(), tentaikhoan, matkhau, trangthai);
		return accounts.isEmpty() ? null : accounts.get(0);
	}

}
