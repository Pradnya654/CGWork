package com.capg.exception;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capg.exception.ErrorInfo;

@ControllerAdvice
public class GlobalAssignmentException {
	
	
	@ExceptionHandler(CustomException.class)
	public @ResponseBody ErrorInfo excetionHandler(CustomException e,HttpServletRequest request) {
		ErrorInfo errorInfo=new ErrorInfo(e.getMessage(), LocalDateTime.now().toString(), request.getRequestURI());
		return errorInfo;
	}
	

}
