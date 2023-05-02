package com.example.portfolio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Bio")

public class Profile {
	@Id
	private String id;
	private String name;
	private int serialno;
	private int age;
	private String status;
	private String about;
	private String skills;
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSerialno() {
		return serialno;
	}
	public int getAge() {
		return age;
	}
	public String getStatus() {
		return status;
	}
	public String getAbout() {
		return about;
	}
	public String getSkills() {
		return skills;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	
}
