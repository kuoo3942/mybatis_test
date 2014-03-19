package com.mybatis.conf;

public class Users {
	
	private String username = "";        //用户名
	private String password = "";        //密码
	private String name = "";            //姓名
	private String department = "";      //所属部门
	
	private String phone = "";           //电话
	private String email = "";           //邮箱
	private String rolename = "";        //角色名称
    private String productionline = "";  //生产线
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getProductionline() {
		return productionline;
	}
	public void setProductionline(String productionline) {
		this.productionline = productionline;
	}
}
