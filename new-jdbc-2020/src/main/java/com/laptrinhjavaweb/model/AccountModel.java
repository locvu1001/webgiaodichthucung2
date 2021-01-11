package com.laptrinhjavaweb.model;

public class AccountModel extends AbstractModel<AccountModel> {
		private Long idAccount;
		private String tentaikhoan;
		private String matkhau;
		private String tenkhachhang;
		private String sodienthoai;
		private int trangthai;
		private Long roleid;
		private String accountCode;
		private RoleModel role = new RoleModel();
		public Long getIdAccount() {
			return idAccount;
		}
		public void setIdAccount(Long idAccount) {
			this.idAccount = idAccount;
		}
		public String getTentaikhoan() {
			return tentaikhoan;
		}
		public void setTentaikhoan(String tentaikhoan) {
			this.tentaikhoan = tentaikhoan;
		}
		public String getMatkhau() {
			return matkhau;
		}
		public void setMatkhau(String matkhau) {
			this.matkhau = matkhau;
		}
		public String getTenkhachhang() {
			return tenkhachhang;
		}
		public void setTenkhachhang(String tenkhachhang) {
			this.tenkhachhang = tenkhachhang;
		}
		public String getSodienthoai() {
			return sodienthoai;
		}
		public void setSodienthoai(String sodienthoai) {
			this.sodienthoai = sodienthoai;
		}
		public int getTrangthai() {
			return trangthai;
		}
		public void setTrangthai(int trangthai) {
			this.trangthai = trangthai;
		}
		public Long getRoleid() {
			return roleid;
		}
		public void setRoleid(Long roleid) {
			this.roleid = roleid;
		}
		public RoleModel getRole() { return role; }
		public void setRole(RoleModel role) {
			this.role = role;
		}
		public String getAccountCode() {
			return accountCode;
		}
		public void setAccountCode(String accountCode) {
			this.accountCode = accountCode;
		}

}
