package com.ssdimenssion.springwebservice.beans;

import java.util.Date;

public class ToDoBean {
	private long id;
	private String userName;
	private String desc;
	private char isCompleted;
	private Date targetDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public char getIsCompleted() {
		return isCompleted;
	}
	public void setIsCompleted(char isCompleted) {
		this.isCompleted = isCompleted;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public ToDoBean(long id, String userName, String desc, char isCompleted, Date targetDate) {
		super();
		this.id = id;
		this.userName = userName;
		this.desc = desc;
		this.isCompleted = isCompleted;
		this.targetDate = targetDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
