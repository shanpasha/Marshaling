package com.marshling;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlAttribute;
import com.sun.xml.txw2.annotation.XmlElement;

@XmlRootElement
public class Student {
	String name;
	int id;
	String grp;
	String college;
	public Student(String name, int id, String grp, String college) {
		super();
		this.name = name;
		this.id = id;
		this.grp = grp;
		this.college = college;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
@XmlElement
@javax.xml.bind.annotation.XmlAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@XmlElement
	public String getGrp() {
		return grp;
	}

	public void setGrp(String grp) {
		this.grp = grp;
	}
	@XmlElement
	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", grp=" + grp + ", college=" + college + "]";
	}

	
}
