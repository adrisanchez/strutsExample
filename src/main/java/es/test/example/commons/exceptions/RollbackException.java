package es.test.example.commons.exceptions;

import java.util.LinkedHashMap;
import java.util.Map;

public class RollbackException extends RuntimeException {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 7693451440448377647L;
	
	private Map<String, String[]> messages = new LinkedHashMap<String, String[]>();

	public RollbackException(Throwable previous) {
		super(previous);
	}
	
	public RollbackException() {
		super();
	}
	
	public RollbackException(String msg){
		super(msg);
	}

	public RollbackException(String msg, String linea){
		super(msg+linea);
	}
	
	public void addMessage(String message, String[] args) {
		messages.put(messages.size() + "-" + message, args);
	}
	
	public Map<String, String[]> getMessages() {
		return messages;
	}
}
