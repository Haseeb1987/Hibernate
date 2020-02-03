package com.hibernate.chp1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeDetails {
	private int EmpId;
	private String EmpName;
	private double EmpSalary;
	private int EmpWorkDay;
	
	@Id
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(double empSalary) {
		EmpSalary = empSalary;
	}
	public int getEmpWorkDay() {
		return EmpWorkDay;
	}
	public void setEmpWorkDay(int empWorkDay) {
		EmpWorkDay = empWorkDay;
	}
	
	
}
