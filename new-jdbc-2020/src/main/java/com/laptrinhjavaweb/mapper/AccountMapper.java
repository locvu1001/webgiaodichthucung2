package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.AccountModel;
import com.laptrinhjavaweb.model.RoleModel;

public class AccountMapper implements RowMapper<AccountModel> {

	@Override
	public AccountModel mapRow(ResultSet resultSet) {
		try {
			AccountModel account = new AccountModel();
			account.setIdAccount(resultSet.getLong("idaccount"));
			account.setTentaikhoan(resultSet.getString("tentaikhoan"));
			account.setMatkhau(resultSet.getString("matkhau"));
			account.setTenkhachhang(resultSet.getString("tenkhachhang"));
			account.setTrangthai(resultSet.getInt("trangthai"));
			account.setSodienthoai(resultSet.getString("sodienthoai"));
			try {
				RoleModel role = new RoleModel();
				role.setCode(resultSet.getString("code"));
				role.setName(resultSet.getString("name"));
				account.setRole(role);
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
			return account;
		} catch (SQLException e) {
			return null;
		}
	}
}
