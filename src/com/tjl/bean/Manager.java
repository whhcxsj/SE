package com.tjl.bean;

public class Manager {
	private int uid;
	private String uname;
	private String upass;
	private int type;

	public Manager(int uid, String uname, String upass, int type) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upass = upass;
		this.type = type;
	}

	public Manager(String uname, String upass, int type) {
		super();
		this.uname = uname;
		this.upass = upass;
		this.type = type;
	}

	public Manager(String uname, String upass) {
		super();
		this.uname = uname;
		this.upass = upass;
	}

	public Manager() {
		super();
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Manager [uid=" + uid + ", uname=" + uname + ", upass=" + upass + ", type=" + type + "]";
	}

}
