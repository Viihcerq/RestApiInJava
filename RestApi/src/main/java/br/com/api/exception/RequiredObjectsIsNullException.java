package br.com.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class RequiredObjectsIsNullException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public RequiredObjectsIsNullException() {
		super("It isnot allowe to persist a null object!");
	}
	
	public RequiredObjectsIsNullException(String ex) {
		super(ex);
	}

}
