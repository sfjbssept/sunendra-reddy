package com.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
   private static final long serialversionVID=1L;
   private String resourceName;
   private String filename;
   private Object fieldValue;
   public String getResourceName() {
	return resourceName;
}

public String getFilename() {
	return filename;
}

public Object getFieldValue() {
	return fieldValue;
	
}

public ResourceNotFoundException(String resourceName, String filename, Object fieldValue) {
	super(String.format("%s not found with %s %s", resourceName,filename,fieldValue));
	this.resourceName = resourceName;
	this.filename = filename;
	this.fieldValue = fieldValue;
}


   
}
