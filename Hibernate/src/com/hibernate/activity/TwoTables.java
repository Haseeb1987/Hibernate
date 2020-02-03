package com.hibernate.activity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
	
@Entity
@Table(name="TableOne")
@SecondaryTable(name="TableTwo")
public class TwoTables {

	@Id
	@GeneratedValue
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Column(name="TableTwo")
	private String noNull;
	@Column(name="TableTwo")
	private boolean oneVal;
	@Column(name="TableTwo")
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
