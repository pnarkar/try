package com.yusuf.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yusuf.dao.CartDAO;
import com.yusuf.dao.ProductDAO;
import com.yusuf.pojo.ChartItem;
import com.yusuf.pojo.Product;
import com.yusuf.pojo.User;
import com.yusuf.spring.exception.AdException;
@Controller
public class DeleteToCartController {


	
	@RequestMapping(value = "/deleteToCart.htm",method = RequestMethod.POST)
	protected String doSubmitAction(@ModelAttribute("cartitem") ChartItem cartitem, BindingResult result,HttpServletRequest htp) throws Exception {
		
		if (result.hasErrors()) {
			return "CustomerProduct";
		}

		try {
			System.out.print("test");
			CartDAO userDao = new CartDAO();
			System.out.print("test1");
			
			HttpSession session = htp.getSession();
			System.out.println("from page: "+htp.getParameter("productID"));
			//System.out.println("" +htp.getParameter(arg0));
			//long productid=Long.parseLong(htp.getParameter("productID"));
			long cartId=Long.parseLong(htp.getParameter("cartId"));
			
			System.out.println(""+cartId);
			User uid= (User)session.getAttribute("user");
			long id=uid.getUserId();
		
			
		userDao.delete(cartId);
		
		
		
		
		} catch (AdException e) {
			System.out.println("Exception: " + e.getMessage());
		}

	return "ToCustomerCart";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/deleteToCart.htm",method = RequestMethod.GET)
public ModelAndView initializeForm(@RequestParam("cartId")long cartId,@ModelAttribute("cartitem") ChartItem cartitem, BindingResult result)throws Exception {
		
		
	    
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("cartId",cartId);
	//mv.addObject("sellerQuantity", sellerQuantity);
		mv.setViewName("DeleteItem");
		return mv;
	}
	
}
