package com.hibernate.activity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

@Entity
@Table(name="FirstTable")
@SecondaryTable(name="TwoTable")
public class FirstClass {
	
	@Id
	@Column(name="IdColumn",table="FirstTable")
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="StringColumn",table="FirstTable")
	private String str;

	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
	@Column(nullable=false, table="TwoTable")
	private String noNull;
	@Basic
	@Column(table="TwoTable")
	private boolean oneVal;
	@Transient
	@Column(table="TwoTable")
	private String pass;

	public String getNoNull() {
		return noNull;
	}
	public void setNoNull(String noNull) {
		this.noNull = noNull;
	}
	public boolean isOneVal() {
		return oneVal;
	}
	public void setOneVal(boolean oneVal) {
		this.oneVal = oneVal;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
