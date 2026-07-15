package com.coforge.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Company {
	@Value("${Company.uid}")
	private int uid;
	@Value("${Company.cName}")
	private String cName;
	@Value("${Company.uid}")
	private String address;
	
	@Autowired					//setter based injection
	private Programmer programmer;
	
	

	public Company(int uid, String cName, String address, Programmer programmer) {
		super();
		this.uid = uid;
		this.cName = cName;
		this.address = address;
		this.programmer = programmer;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setProgrammer(Programmer programmer) {
		this.programmer = programmer;
	}

	@Override
	public String toString() {
		return "Company [uid=" + uid + ", cName=" + cName + ", address=" + address + ", programmer=" + programmer + "]";
	}

	
}
