package com.hibernate.chp1;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table (name="EmployeeInfo")
public class Employee {
	private int empId;
	private String empName;
	private String empPassword;
	private String empEmailAddress;
	private boolean isPremanent;
	private Calendar empJointDate;
	private String empLoginTime;
	
	@Id
	@TableGenerator (name="empid", table="emppktb",  pkColumnName="empkey", 
		pkColumnValue="empvalue", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="empid")
	@Column (name="EmployeeId")
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Column(name="EmployeeName")
	public String getName() {
		return empName;
	}
	public void setName(String empName) {
		this.empName = empName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Transient
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	@Column (nullable=false)
	public String getEmpEmailAddress() {
		return empEmailAddress;
	}
	public void setEmpEmailAddress(String empEmailAddress) {
		this.empEmailAddress = empEmailAddress;
	}
	@Basic
	public boolean isPremanent() {
		return isPremanent;
	}
	public void setPremanent(boolean isPremanent) {
		this.isPremanent = isPremanent;
	}
	@Temporal (TemporalType.DATE)
	public Calendar getEmpJointDate() {
		return empJointDate;
	}
	public void setEmpJointDate(Calendar empJointDate) {
		this.empJointDate = empJointDate;
	}
	public String getEmpLoginTime() {
		return empLoginTime;
	}
	public void setEmpLoginTime(String empLoginTime) {
		this.empLoginTime = empLoginTime;
	}
	
	
}
