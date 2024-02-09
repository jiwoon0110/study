package com.kh.Test2402062;

public class Lottery { 
	
	private String name;
	private String phone;
	
	public Lottery() {
		super();
	}
	
	public Lottery(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "( 이름 : " + name + ", 번호 : " + phone + " )";
	}

	@Override
	public int hashCode() {
		String str = name + phone;
		return  str.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		Lottery l = (Lottery)obj;
		
		if (this.getName().equals(l.getName()) &&
				this.getPhone().equals(l.getPhone())) {
			return true;
		}
		
		return false; 
	}
	
	
}
