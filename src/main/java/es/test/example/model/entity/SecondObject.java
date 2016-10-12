
package es.test.example.model.entity;

import java.io.Serializable;
import java.util.Date;


public class SecondObject implements Serializable{

	private static final long serialVersionUID = -6348942827826898582L;
	
	private Long property;
	
	public SecondObject() {
		super();
		this.property = new Long(1);
	}

	public Long getProperty() {
		return property;
	}

	public void setProperty(Long property) {
		this.property = property;
	}
	
	
} //end secondObject
