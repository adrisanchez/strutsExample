/**
 * 
 */
package es.test.example.control.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.security.Authentication;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import es.test.example.control.formView.ExampleBaseFormView;


public class BaseAction extends ActionSupport implements ServletRequestAware,
		ServletResponseAware, SessionAware, Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2967413615009712135L;
	
	/** The class name. */
	private static String className = BaseAction.class.getPackage()
			.getName();

	/** Logger. */
	private static Logger logger = Logger.getLogger(className);
	
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected Map<String, Object> session;
	

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.Preparable#prepare()
	 */
	@Override
	public void prepare() throws Exception {

	}

	/* (non-Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}

	/* (non-Javadoc)
	 * @see org.apache.struts2.interceptor.ServletResponseAware#setServletResponse(javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		this.response = arg0;
	}

	/* (non-Javadoc)
	 * @see org.apache.struts2.interceptor.ServletRequestAware#setServletRequest(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;

	}

	/**
	 * @return the request
	 */
	public HttpServletRequest getRequest() {
		return request;
	}

	/**
	 * @return the response
	 */
	public HttpServletResponse getResponse() {
		return response;
	}

	/**
	 * @return the session
	 */
	public Map<String, Object> getSession() {
		return session;
	}
	
	public void adjuntarMensajesAnteriores() {
		ModelDriven<?> mdAction = (ModelDriven<?>)this;
		ExampleBaseFormView form = (ExampleBaseFormView)mdAction.getModel();
		String mensaje;

		try {
	    	if( StringUtils.isNotBlank(request.getParameter("errorAnterior")) ) {
	    		mensaje = form.getErrorAnterior();
	    		String[] mensajes = mensaje.split("@@@");
	    		for (String s : mensajes) {
	    			addActionError(s);
	    		}
	    	} 
	    	if( StringUtils.isNotBlank(request.getParameter("mensajeAnterior")) ) {
	    		mensaje = form.getMensajeAnterior();
	    		String[] mensajes = mensaje.split("@@@");
	    		for (String s : mensajes) {
	    			addActionMessage(s);
	    		}
	    	}
		} catch (Exception ignored) {
			logger.error(ignored.getMessage());
		}
	}
	
	public String getMessagesError(Map<String, String[]> messages) {
		String msgsError = "";
		
		for(Map.Entry<String, String[]> mensaje : messages.entrySet()) {
			if(mensaje == null || mensaje.getKey() == null) {
				continue;
			}
			
			//El mensaje tendrá un formato 0-informes.informeOperativo.msg.busquedaLimitada, xo la 1a parte no interesa
			String[] v = mensaje.getKey().split("-");
			if( v == null) {
				continue;
			}
			if(mensaje.getValue() != null) { 
				String msg[] = new String[ mensaje.getValue().length];
				int i = 0;
				for(String str :  mensaje.getValue()) {
					msg[i] = getText(str);
					i++;
				}
				if(!msgsError.isEmpty()) {
					msgsError = msgsError + "@@@";
				}

					msgsError = msgsError + getText(v[1],  msg);
			} else {
				if(!msgsError.isEmpty()) {
					msgsError = msgsError + "@@@";
				}
				msgsError = msgsError + getText(v[1]);
			}
		}
		return msgsError;
	}

	public String getRol() {
		Map<String, Object> sesion = ActionContext.getContext().getSession();
		Authentication auth = (Authentication) sesion.get("ROLE_ADMIN");
		if (auth == null) {
			return null;
		} else {
			return auth.getAuthorities()[0].toString();
		}
	}
	
}
