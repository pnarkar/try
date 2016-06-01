package com.yusuf.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.yusuf.pojo.User;

public class RegisterValidator implements Validator {

	public boolean supports(Class aClass)
    {
        return aClass.equals(User.class);
    }

    public void validate(Object obj, Errors errors)
    {
    	User user = (User) obj;
        String a = user.getFirstname();
    String q=a.replaceAll("[^\\dA-Za-z ]","").replaceAll("\\s+","+").trim();
        	 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstname", "error.invalid.user", "First Name Required");
      user.setFirstname(q);  
       
      String b = user.getLastname();
      String r=   b.replaceAll("[^\\dA-Za-z ]","").replaceAll("\\s+","+").trim();
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastname", "error.invalid.user", "Last Name Required");
        user.setFirstname(r);
        
        
        String c = user.getUsername();
        String s=   c.replaceAll("[^\\dA-Za-z ]","").replaceAll("\\s+","+").trim();
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "error.invalid.user", "User Name Required");
        user.setFirstname(s);
        
        String d = user.getPassword();
        String t=   d.replaceAll("[^\\dA-Za-z ]","").replaceAll("\\s+","+").trim();
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.invalid.password", "Password Required");
        user.setFirstname(t);
        
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "UserType", "error.invalid.user", "UserType Required");
    }
}
