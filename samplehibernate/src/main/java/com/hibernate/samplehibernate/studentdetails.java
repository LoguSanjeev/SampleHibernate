package com.hibernate.samplehibernate;

import javax.persistence.Entity;

@Entity
public class studentdetails {
@javax.persistence.Id
private int Id;
private String Name;
private String Addr;
private int Age;

@Override
public String toString() {
	return "studentdetails [Id=" + Id + ", Name=" + Name + ", Addr=" + Addr + ", Age=" + Age + "]";
}

public studentdetails() {
	super();
	// TODO Auto-generated constructor stub
}
public studentdetails(int id, String name, String addr, int age) {
	super();
	
	Id = id;
	Name = name;
	Addr = addr;
	Age = age;
}


	public int getId() {
	return Id;
	}
	public void setId(int id) {
	Id = id;
	}
	public String getName() {
	return Name;
	}
	public void setName(String name) {
	Name = name;
	}
	public String getAddr() {
	return Addr;
	}
	public void setAddr(String addr) {
	Addr = addr;
	}
	public int getAge() {
	return Age;
	}
	public void setAge(int age) {
	Age = age;
	}

	
}
