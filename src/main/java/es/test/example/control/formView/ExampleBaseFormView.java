/**
 * 
 */
package es.test.example.control.formView;

import java.io.Serializable;

/**
 * Clase de la que extenderán todos los FormView
 *
 */
public class ExampleBaseFormView implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = -1665961292873488517L;
	
	private String mensajeAnterior;
	private String errorAnterior;
	private String returnCode;
	private String codigo;
	/**
	 * @return the mensajeAnterior
	 */
	public String getMensajeAnterior() {
		return mensajeAnterior;
	}
	/**
	 * @param mensajeAnterior the mensajeAnterior to set
	 */
	public void setMensajeAnterior(String mensajeAnterior) {
		this.mensajeAnterior = mensajeAnterior;
	}
	/**
	 * @return the errorAnterior
	 */
	public String getErrorAnterior() {
		return errorAnterior;
	}
	/**
	 * @param errorAnterior the errorAnterior to set
	 */
	public void setErrorAnterior(String errorAnterior) {
		this.errorAnterior = errorAnterior;
	}
	/**
	 * @return the returnCode
	 */
	public String getReturnCode() {
		return returnCode;
	}
	/**
	 * @param returnCode the returnCode to set
	 */
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
