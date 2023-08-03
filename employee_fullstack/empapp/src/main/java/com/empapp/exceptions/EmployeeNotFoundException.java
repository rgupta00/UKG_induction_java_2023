package com.empapp.exceptions;

public class EmployeeNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -7138826226788628120L;

	public EmployeeNotFoundException(String message) {
		super(message);
	}
}
