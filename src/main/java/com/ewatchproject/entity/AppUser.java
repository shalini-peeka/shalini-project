package com.ewatchproject.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import com.ewatchproject.enums.Role;
@Component
@Entity
public class AppUser {
	@Id
	private String userName;
	private String password;
	private Role role;
	private long mobileNumber;
	@OneToMany(mappedBy="appUserEntity")
	private List<Channel> userChannel;
//	@OneToMany(mappedBy="appUserentity")
//	private List<Plan> userPlan;

	@Override
	public String toString() {
		return "AppUser [userName=" + userName + ", password=" + password + ", role=" + role + ", mobileNumber="
				+ mobileNumber + ", userChannel=" + userChannel + " ]";
	}


	public AppUser(String userName, String password, Role role, long mobileNumber, List<Channel> userChannel) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.mobileNumber = mobileNumber;
		this.userChannel = userChannel;
	}
	
	
	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<Channel> getUserChannel() {
		return userChannel;
	}
	public void setUserChannel(List<Channel> userChannel) {
		userChannel = userChannel;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRolel(Role role) {
		this.role = role;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		mobileNumber = mobileNumber;
	}


	public void setRole(Role role) {
		this.role = role;
	}
}
