package org.example.drools.model;

import java.io.Serializable;
import java.util.HashMap;



public class Result implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean successful;

	public boolean isSuccessful() {
		return successful;
	}

	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}
}
