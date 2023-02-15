package com.springcore;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("1")
	private int id;
	
	@Value("Debanjan")
	private String name;
	
	@Value("Intern")
	private String desgn;
	
	@Value("#{'9432455235,9432455234'.split(',')}")
	private List<String> contactNo;
	
	@Value("#{projList}")
	private List<String> projects;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesgn() {
		return desgn;
	}

	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}

	public List<String> getContactNo() {
		return contactNo;
	}

	public void setContactNo(List<String> contactNo) {
		this.contactNo = contactNo;
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	public Person(int id, String name, String desgn, List<String> contactNo, List<String> projects) {
		this.id = id;
		this.name = name;
		this.desgn = desgn;
		this.contactNo = contactNo;
		this.projects = projects;
	}

	public Person() {
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", desgn=" + desgn + ", contactNo=" + contactNo + ", projects="
				+ projects + "]";
	}
	
	
}
