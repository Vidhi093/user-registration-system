package com.jsp.controller;

import java.util.ArrayList;
import java.util.List;

public class UserInfo {
	private String username;
	private String password;
	private String name;
	private String email;
	
	private static List<UserInfo> infos = new ArrayList<UserInfo>();
	
	public static List<UserInfo> getInfos() {
		return infos;
	}

	public static void setInfos(List<UserInfo> infos) {
		UserInfo.infos = infos;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
