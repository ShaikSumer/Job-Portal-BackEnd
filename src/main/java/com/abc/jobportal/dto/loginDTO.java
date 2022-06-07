package com.abc.jobportal.dto;

import java.util.Objects;

public class loginDTO {
	String username;
	String Password;
	
	public loginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public loginDTO(String username, String password) {
		super();
		this.username = username;
		this.Password = password;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Password, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		loginDTO other = (loginDTO) obj;
		return Objects.equals(Password, other.Password) && Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "loginDTO [username=" + username + ", Password=" + Password + "]";
	}
	

}
