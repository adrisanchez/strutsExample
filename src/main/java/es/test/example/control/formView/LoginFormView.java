package es.test.example.control.formView;

import es.test.example.model.entity.FirstObject;

public class LoginFormView extends ExampleBaseFormView{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7590650875594384501L;
	
	private FirstObject firstObject;
	
	public LoginFormView() {
		this.firstObject = new FirstObject();
	}
	public void prepare() {
		this.firstObject = new FirstObject();
	}

	public FirstObject getFirstObject() {
		return firstObject;
	}

	public void setFirstObject(FirstObject firstObject) {
		this.firstObject = firstObject;
	}

	public Long getPropertyFunction() {
		return this.firstObject.getSObject().getProperty();
	}
}
