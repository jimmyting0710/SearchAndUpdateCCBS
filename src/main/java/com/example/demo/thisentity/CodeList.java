package com.example.demo.thisentity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CODE_LIST")
public class CodeList {
	@Id
	private String CODE_ID;
	private String CODE_TYPE;
	private String CODE_DESC;
	private String CODE_ENABLED;
	private String CODE_TYPE_ID;
	
	public String getCODE_ID() {
		return CODE_ID;
	}
	public void setCODE_ID(String cODE_ID) {
		CODE_ID = cODE_ID;
	}
	public String getCODE_TYPE() {
		return CODE_TYPE;
	}
	public void setCODE_TYPE(String cODE_TYPE) {
		CODE_TYPE = cODE_TYPE;
	}
	public String getCODE_DESC() {
		return CODE_DESC;
	}
	public void setCODE_DESC(String cODE_DESC) {
		CODE_DESC = cODE_DESC;
	}
	public String getCODE_ENABLED() {
		return CODE_ENABLED;
	}
	public void setCODE_ENABLED(String cODE_ENABLED) {
		CODE_ENABLED = cODE_ENABLED;
	}
	public String getCODE_TYPE_ID() {
		return CODE_TYPE_ID;
	}
	public void setCODE_TYPE_ID(String cODE_TYPE_ID) {
		CODE_TYPE_ID = cODE_TYPE_ID;
	}
	
	
	
}
