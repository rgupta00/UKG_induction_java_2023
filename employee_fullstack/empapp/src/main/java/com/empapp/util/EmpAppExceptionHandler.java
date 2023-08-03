package com.empapp.util;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.empapp.dto.ErrorInfo;
import com.empapp.exception.EmployeeNotFoundException;

@RestControllerAdvice	//AOP*
public class EmpAppExceptionHandler {

	//--------------emplyee not found ex-------------
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ErrorInfo handle404(EmployeeNotFoundException ex) {
		ErrorInfo errorInfo=new ErrorInfo();
		errorInfo.setError(ex.getMessage());
		errorInfo.setStatusCode(HttpStatus.NOT_FOUND.toString());
		errorInfo.setTimestamp(LocalDateTime.now());
		errorInfo.setToContact("ukg@team.com");
		return errorInfo;
	}
    
  //--------------emplyee not found ex-------------
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public ErrorInfo handle500(Exception ex) {
		ErrorInfo errorInfo=new ErrorInfo();
		errorInfo.setError("pls try after time");
		errorInfo.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
		errorInfo.setTimestamp(LocalDateTime.now());
		errorInfo.setToContact("ukg@team.com");
		return errorInfo;
	}
}
