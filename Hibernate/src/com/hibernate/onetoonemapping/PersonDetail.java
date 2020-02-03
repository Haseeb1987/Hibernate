package com.hibernate.onetoonemapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PersonDetail {
	private int personDetaild;
	private String zipCode;
	private String job;
	private double income;
	
	private Person person;
	
	@OneToOne (mappedBy="personDetail", cascade=CascadeType.ALL)
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Id
	@GeneratedValue
	@Column(name="detaild_PK")
	public int getPersonDetaild() {
		return personDetaild;
	}
	public void setPersonDetaild(int personDetaild) {
		this.personDetaild = personDetaild;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	
	
}
