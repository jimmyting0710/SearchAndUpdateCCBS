package com.example.demo.thisentity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEFECT_LIST")
public class DefectList {
	@Id
	private String TEST_TYPE;
	private String ISSUE_KEY;
	private String JID;
	private String ISSUE_TYPE;
	private String ISSUE_STATUS;
	private String ISSUE_CREATE_DATETIME;
	
	public String getTEST_TYPE() {
		return TEST_TYPE;
	}
	public void setTEST_TYPE(String tEST_TYPE) {
		TEST_TYPE = tEST_TYPE;
	}
	public String getISSUE_KEY() {
		return ISSUE_KEY;
	}
	public void setISSUE_KEY(String iSSUE_KEY) {
		ISSUE_KEY = iSSUE_KEY;
	}
	public String getJID() {
		return JID;
	}
	public void setJID(String jID) {
		JID = jID;
	}
	public String getISSUE_TYPE() {
		return ISSUE_TYPE;
	}
	public void setISSUE_TYPE(String iSSUE_TYPE) {
		ISSUE_TYPE = iSSUE_TYPE;
	}
	public String getISSUE_STATUS() {
		return ISSUE_STATUS;
	}
	public void setISSUE_STATUS(String iSSUE_STATUS) {
		ISSUE_STATUS = iSSUE_STATUS;
	}
	public String getISSUE_CREATE_DATETIME() {
		return ISSUE_CREATE_DATETIME;
	}
	public void setISSUE_CREATE_DATETIME(String iSSUE_CREATE_DATETIME) {
		ISSUE_CREATE_DATETIME = iSSUE_CREATE_DATETIME;
	}
	
	
}
