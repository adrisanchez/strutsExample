
package es.test.example.model.entity;

import java.io.Serializable;
import java.util.Date;



public class FirstObject implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6348944827826898582L;
	
	private SecondObject sObject;

	public FirstObject() {
		super();
		this.sObject = new SecondObject();
	}
	
	public SecondObject getSObject() {
		return sObject;
	}

	public void setSObject(SecondObject secondObject) {
		this.sObject = secondObject;
	}
	
} 
