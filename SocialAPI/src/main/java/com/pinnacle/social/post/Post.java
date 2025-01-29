package com.pinnacle.social.post;

import com.pinnacle.social.user.User;

public class Post {
	
	public String id;
	public String date;
	public User user;
	public String details;
	
	public Post(String id, String date, User user, String details) {
		this.id = id;
		this.date =date;
		this.user = user;
		this.details = details;
	}
	
	public String getId() {
		return id;
	}
	
	public String setId(String id) {
		return this.id = id;
		
	}
	
	public String getDate()
	{
		return date;
	}
	
	public String setDate(String date)
	{
		return this.date = date;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	
	

}
