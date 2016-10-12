
package es.test.example.commons.utils;

import java.util.ResourceBundle;

public final class Utils {

	/**
	 * Consructor (bloqueado).
	 */	
	private Utils() {
	}

	/**
	 * Método que obtiene una property de un fichero concreto.
	 * 
	 * @param fichero
	 *            Nombre del fichero
	 * @param key
	 *            Clave a recuperar
	 * 
	 * @return String valor recuperado
	 */
	public static String getProperty(final String fichero, final String key) {
		ResourceBundle props = ResourceBundle.getBundle(fichero);

		return props.getString(key);
	}
	
	/**
	 * Método para comprobar si un string es nulo o vacío.
	 * 
	 * @param s String a comprobar
	 * 
	 * @return true si <s> es nulo o vacío. Falso en caso contrario.
	 */
	public static boolean nullOrBlank(final String s) {
		return (s == null || s.trim().isEmpty());
	}
}
