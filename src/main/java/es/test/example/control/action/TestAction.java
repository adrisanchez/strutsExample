package es.test.example.control.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ModelDriven;

import es.test.example.control.formView.LoginFormView;

public class TestAction extends BaseAction implements ModelDriven<LoginFormView> {

	private static final long serialVersionUID = 4828062352242442388L;

	// Logger
	private static String className = TestAction.class.getPackage().getName();
	private static Logger logger = Logger.getLogger(className);

	private LoginFormView loginFormView = new LoginFormView();
	
	public String testMethod() {
		return SUCCESS;
	}
	
	@Override
	public LoginFormView getModel() {
		return loginFormView;
	}
}
