package com.yijie.yilian.model;

/**
 * @描述 管理员账户
 * @author Lucifer
 *
 */
public class Admin {
	
	private String id;
	
	private String num;
	
	private String password;
	
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
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

	@Override
	public String toString() {
		return "Admin [id=" + id + ", num=" + num + ", password=" + password + ", name=" + name + "]";
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String id, String num, String password, String name) {
		super();
		this.id = id;
		this.num = num;
		this.password = password;
		this.name = name;
	}

}
