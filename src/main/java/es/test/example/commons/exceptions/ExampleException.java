
package es.test.example.commons.exceptions;

/**
 * Clase base para las excepciones de la aplicación
 *
 */
public class ExampleException extends Exception {

	private static final long serialVersionUID = -1140208140896143956L;
	
	private String error;
	
	public ExampleException(String e) {
		this.error = e;
	}

	
	//GETTERS Y SETTERS
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
}
