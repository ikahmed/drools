package org.example.drools.model;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;


	private String englishName;

	private String shortName;

	private String vhost;

	private boolean activity;

	public Customer() {
	}

	public Customer(int id,  String englishName, String shortName, String vhost) {

		this.id = id;
		this.englishName = englishName;
		this.shortName = shortName;
		this.vhost = vhost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getVhost() {
		return vhost;
	}

	public void setVhost(String vhost) {
		this.vhost = vhost;
	}

	public void setActivity(boolean activity) {
		this.activity = activity;
	}

	public boolean isActivity() {
		return activity;
	}



}