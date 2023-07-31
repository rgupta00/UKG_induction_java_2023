package com.empapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException{
	private static final long serialVersionUID = -4249276493175968624L;

	public EmployeeNotFoundException(String message) {
		super(message);
	}
}
