package com.yusuf.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yusuf.dao.CartDAO;
import com.yusuf.dao.UserDAO;
import com.yusuf.pojo.ChartItem;
import com.yusuf.pojo.User;
import com.yusuf.spring.exception.AdException;

@Controller
public class AdminDeleteUserController {
	@RequestMapping(value = "/deleteUser.htm",method = RequestMethod.POST)
	protected String doSubmitAction(@ModelAttribute("user") User user, BindingResult result,HttpServletRequest htp) throws Exception {
		
		if (result.hasErrors()) {
			return "loginuser";
		}

		try {
			System.out.print("test");
			UserDAO userDao = new UserDAO();
			System.out.print("test1");
			
			HttpSession session = htp.getSession();
			System.out.println("from page: "+htp.getParameter("productID"));
			
		String username= (String) htp.getParameter("username");
		
		System.out.println("us"+username);	
		userDao.delete(username);
		
		
		
		
		} catch (AdException e) {
			System.out.println("Exception: " + e.getMessage());
		}

	return "AdminConDel";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/deleteUser.htm",method = RequestMethod.GET)
public ModelAndView initializeForm(@RequestParam("username")String username,@ModelAttribute("user") User user, BindingResult result)throws Exception {
		
		
		System.out.println("us1"+username);		
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("username",username);
	//mv.addObject("sellerQuantity", sellerQuantity);
		mv.setViewName("DeleteUserfromlistjsp");
		return mv;
	}
	
}
