package org.example.drools.model;


import java.io.Serializable;
import java.util.Date;

public class Notification implements Serializable {
	private static final long serialVersionUID = 1L;

	private long id;

	private String identity;

	private String type;

	private Date recordDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}
}