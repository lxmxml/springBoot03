package com.lxm.bean;

public class Meeting {
	private String title;
	private String id;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	private Users users;
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Meeting [title=" + title + ", id=" + id + ", users=" + users + "]";
	}
	
	
}
