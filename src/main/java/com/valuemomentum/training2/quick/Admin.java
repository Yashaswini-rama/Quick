package com.valuemomentum.training2.quick;

public class Admin {
	private int eid;
	private String fisrt_name;
	private String last_name;
	private String contact;
	private String designation;
	private String doj;
	private int dept_id;
	private double salary;
	private String pw;


	Admin(){

	}
	


	public Admin(int eid, String fisrt_name, String last_name, String contact, String designation, String doj,
			int dept_id, double salary, String pw) 
	{
		super();
		this.eid = eid;
		this.fisrt_name = fisrt_name;
		this.last_name = last_name;
		this.contact = contact;
		this.designation = designation;
		this.doj = doj;
		this.dept_id = dept_id;
		this.salary = salary;
		this.pw = pw;
	}

	


	
	public int getEid() {
		return eid;
	}



	public void setEid(int eid) {
		this.eid = eid;
	}



	public String getFisrt_name() {
		return fisrt_name;
	}



	public void setFisrt_name(String fisrt_name) {
		this.fisrt_name = fisrt_name;
	}



	public String getLast_name() {
		return last_name;
	}



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public String getDoj() {
		return doj;
	}



	public void setDoj(String doj) {
		this.doj = doj;
	}



	public int getDept_id() {
		return dept_id;
	}



	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getPw() {
		return pw;
	}



	public void setPw(String pw) {
		this.pw = pw;
	}



	@Override
	public String toString() {
		return "Admin [eid=" + eid + ", fisrt_name=" + fisrt_name + ", last_name=" + last_name + ", contact=" + contact
				+ ", designation=" + designation + ", doj=" + doj + ", dept_id=" + dept_id + ", salary=" + salary
				+ ", pw=" + pw + "]";
	}

}

