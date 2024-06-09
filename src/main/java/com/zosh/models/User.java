package com.zosh.models;

public class User {
    private Integer id;
	private String firstName;
	private String lirstName;
	private String email;
	private String password;
	
	public User() {
		
	}
	
	public User(Integer id, String firstName, String lirstName, String email, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lirstName = lirstName;
		this.email = email;
		this.password = password;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLirstName() {
		return lirstName;
	}
	public void setLirstName(String lirstName) {
		this.lirstName = lirstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
