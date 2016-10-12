package es.test.example.control.action;

import org.apache.log4j.Logger;
import org.springframework.security.AuthenticationException;
import org.springframework.security.ui.AbstractProcessingFilter;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import es.test.example.control.formView.LoginFormView;

/**
 * Clase de control para las acciones asociadas a general.
 */
public class LoginAction extends BaseAction implements ModelDriven<LoginFormView> {

	private static final long serialVersionUID = 4828062352242442388L;

	// Logger
	private static String className = LoginAction.class.getPackage().getName();
	private static Logger logger = Logger.getLogger(className);

	private LoginFormView loginFormView = new LoginFormView();

	
	public String login() throws Exception {
		return ActionSupport.SUCCESS;
	}
	
	public String inicio() throws Exception {
		return ActionSupport.SUCCESS;
	}
	
	public String loginIncorrecto() throws Exception {
		AuthenticationException au = (AuthenticationException) session.get(
				AbstractProcessingFilter.SPRING_SECURITY_LAST_EXCEPTION_KEY);
		String codigo = au.getMessage();
		if( au.getExtraInformation() != null ) {
			String[] param = {au.getExtraInformation().toString()};
			addActionError(getText(codigo, param) );
		} else {
			addActionError(getText(codigo) );			
		}
		getModel().setErrorAnterior("Error1");
		return ActionSupport.SUCCESS;
	}
	
	
	public String loadErrorPage() {
		return ActionSupport.SUCCESS;
	}
	
	public String acercaDe() {
		return ActionSupport.SUCCESS;
	}

	@Override
	public LoginFormView getModel() {
		return loginFormView;
	}

}
