package com.abc.jobportal.entity;
import java.util.List;
import java.util.Objects;
import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "User")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int userId;
	private String Username;
	private String Password;
	private String role;

	





	public User() {
		super();
		// TODO Auto-generated constructor stub
	}







	public User(int userId, String username, String password, String role, long debitCardNo, int totalPurchase) {
		super();
		this.userId = userId;
		Username = username;
		Password = password;
		this.role = role;
	
	
	
	}







	public int getUserId() {
		return userId;
	}







	public void setUserId(int userId) {
		this.userId = userId;
	}







	public String getUsername() {
		return Username;
	}







	public void setUsername(String username) {
		Username = username;
	}







	public String getPassword() {
		return Password;
	}







	public void setPassword(String password) {
		Password = password;
	}







	public String getRole() {
		return role;
	}







	public void setRole(String role) {
		this.role = role;
	}









	@Override
	public int hashCode() {
		return Objects.hash(Password, Username, role, userId);
	}







	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(Password, other.Password) && Objects.equals(Username, other.Username)
				&& Objects.equals(role, other.role) && userId == other.userId;
	}







	@Override
	public String toString() {
		return "User [userId=" + userId + ", Username=" + Username + ", Password=" + Password + ", role=" + role
				+ ", DebitCardNo="  + ", TotalPurchase="  + ", userDeatils=" 
				+ ", order=" + "]";
	}







	



	
}