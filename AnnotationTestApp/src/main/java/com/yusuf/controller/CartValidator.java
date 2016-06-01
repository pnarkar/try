package com.yusuf.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


import com.yusuf.pojo.ChartItem;
import com.yusuf.pojo.User;
public class CartValidator implements Validator {

	 public boolean supports(Class aClass)
	    {
	        return aClass.equals(ChartItem.class);
	    }

	    public void validate(Object obj, Errors errors)
	    {
	    	ChartItem user = (ChartItem) obj;
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Quantity", "error.invalid.user", "Quantity Required");
	        
	    }

}
