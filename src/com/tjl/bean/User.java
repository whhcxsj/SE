package com.tjl.bean;

public class User {
	private String academy;
	private String grade;
	private String date;
	private String name;
	private String phone;
	private String province;
	private String city;
	private String region;
	private String IsReturn;
	private String IsSuspect;
	private String IsInfect;

	public User(String grade, String date, String name, String phone, String province, String region, String isInfect) {
		super();
		this.grade = grade;
		this.date = date;
		this.name = name;
		this.phone = phone;
		this.province = province;
		this.region = region;
		IsInfect = isInfect;
	}

	public User(String grade, String date, String name, String phone, String province, String region, String isSuspect,
			String isInfect) {
		super();
		this.grade = grade;
		this.date = date;
		this.name = name;
		this.phone = phone;
		this.province = province;
		this.region = region;
		IsSuspect = isSuspect;
		IsInfect = isInfect;
	}

	public User(String grade, String date, String name, String phone, String province, String region, String isReturn,
			String isSuspect, String isInfect) {
		super();
		this.grade = grade;
		this.date = date;
		this.name = name;
		this.phone = phone;
		this.province = province;
		this.region = region;
		IsReturn = isReturn;
		IsSuspect = isSuspect;
		IsInfect = isInfect;
	}

	public User(String grade, String date, String name, String phone, String province, String city, String region,
			String isReturn, String isSuspect, String isInfect) {
		super();
		this.grade = grade;
		this.date = date;
		this.name = name;
		this.phone = phone;
		this.province = province;
		this.city = city;
		this.region = region;
		IsReturn = isReturn;
		IsSuspect = isSuspect;
		IsInfect = isInfect;
	}

	public User(String academy, String grade, String date, String name, String phone, String province, String city,
			String region, String isReturn, String isSuspect, String isInfect) {
		super();
		this.academy = academy;
		this.grade = grade;
		this.date = date;
		this.name = name;
		this.phone = phone;
		this.province = province;
		this.city = city;
		this.region = region;
		IsReturn = isReturn;
		IsSuspect = isSuspect;
		IsInfect = isInfect;
	}

	public String getAcademy() {
		return academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getIsReturn() {
		return IsReturn;
	}

	public void setIsReturn(String isReturn) {
		IsReturn = isReturn;
	}

	public String getIsSuspect() {
		return IsSuspect;
	}

	public void setIsSuspect(String isSuspect) {
		IsSuspect = isSuspect;
	}

	public String getIsInfect() {
		return IsInfect;
	}

	public void setIsInfect(String isInfect) {
		IsInfect = isInfect;
	}

	@Override
	public String toString() {
		return "User [academy=" + academy + ", grade=" + grade + ", date=" + date + ", name=" + name + ", phone="
				+ phone + ", province=" + province + ", city=" + city + ", region=" + region + ", IsReturn=" + IsReturn
				+ ", IsSuspect=" + IsSuspect + ", IsInfect=" + IsInfect + "]";
	}

}
