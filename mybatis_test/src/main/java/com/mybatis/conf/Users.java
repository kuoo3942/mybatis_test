package com.mybatis.conf;

public class Users {
	
	private String username = "";        //�û���
	private String password = "";        //����
	private String name = "";            //����
	private String department = "";      //��������
	
	private String phone = "";           //�绰
	private String email = "";           //����
	private String rolename = "";        //��ɫ����
    private String productionline = "";  //������
    
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
