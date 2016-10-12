/**
 * 
 */
package es.test.example.commons.exceptions;

import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.interceptor.ExceptionMappingInterceptor;

import es.test.example.commons.errorcodes.ExampleBaseErrorCodes;
import es.test.example.control.formView.ExampleBaseFormView;


/**
 *
 */
public class ExampleExceptionInterceptor extends
		ExceptionMappingInterceptor {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1708909404160984142L;
	
	/**
	 * Logger
	 */
	private Logger logger = Logger.getLogger(ExampleExceptionInterceptor.class);
	

	/**
     * @param invocation Acción a invocar
     *
     * @exception Exception excepción durante la invocación
     *
     * @return String resultado de la acción
     */
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		String sReturn = ActionSupport.SUCCESS;
		StringBuffer auxMensaje = new StringBuffer();
		ActionSupport action = (ActionSupport)actionInvocation.getAction();
		ExampleBaseFormView form = (ExampleBaseFormView) ((ModelDriven<?>)action).getModel();
		
		try {
			trimRequest();
			
			sReturn = super.intercept(actionInvocation);
		} catch (Throwable e) {
			try {
				sReturn = ActionSupport.ERROR;
				if (e instanceof RollbackException) {
					Map<String, String[]> lista = ((RollbackException)e).getMessages();
					for (Map.Entry<String, String[]> item : lista.entrySet()) {
						logger.debug("--- " + item);
						String[] keyTime = item.getKey().split("-");
						String key = keyTime[0];
						if (keyTime.length > 1) {
							key = keyTime[1];
						}
						String[] params = item.getValue();
						String mensaje = "";
						if (params != null && params.length > 0) {
							for (int i = 0; i < params.length; i++) {
								params[i] = action.getText(params[i]);
							}
							mensaje = action.getText(key, params);
						} else {
							mensaje = action.getText(key);
						}
						action.addActionError(mensaje);
						if (StringUtils.isNotBlank(auxMensaje.toString())){
							auxMensaje.append("@@@");
						}
						auxMensaje.append(mensaje);
						logger.error("Excepción de negocio " + e.getClass().getCanonicalName() + " [" + mensaje + "]");
					}
					form.setErrorAnterior(auxMensaje.toString());
					logger.debug("", e);
				} else {
					unexpected(e, action, form);
				}
			} catch (Throwable t) {
				unexpected(t, action, form);
			}
		}
		if (action.getActionMessages() != null && action.getActionMessages().size() > 0){
			StringBuffer mensaje = new StringBuffer();
			Iterator<String> it = action.getActionMessages().iterator();
			while (it.hasNext()){
				if (mensaje != null && StringUtils.isNotBlank(mensaje.toString())){
					mensaje.append("@@@");
				}
				mensaje.append(it.next());
			}
			form.setMensajeAnterior(mensaje.toString());
		}
		return sReturn;
	}
	
	private void trimRequest() {
		Map<String, Object> mapa = ActionContext.getContext().getParameters();
		for (Map.Entry<String, Object> param : mapa.entrySet()) {
			Object obj = param.getValue(); 
			if (obj instanceof String) {
				param.setValue(String.valueOf(obj).trim());
			} else if (obj instanceof String[]) {
				String[] objArr = (String[])obj;
				for (int i = 0; i < objArr.length; i++) {
					objArr[i] = objArr[i].trim();
				}
			}
		}
	}
	
	private void unexpected(Throwable e, ActionSupport action, ExampleBaseFormView form) throws Exception {
		logger.error("==============================================================");
		logger.error("                         E R R O R                            ");
		logger.error("==============================================================");
		logger.error("Ha ocurrido una excepción inesperada", e);
		logger.error("==============================================================");
		action.addActionError(action.getText(ExampleBaseErrorCodes.ERROR_INESPERADO));
		form.setErrorAnterior(action.getText(ExampleBaseErrorCodes.ERROR_INESPERADO));
	}


}
