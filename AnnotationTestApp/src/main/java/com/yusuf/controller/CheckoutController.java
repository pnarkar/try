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
import com.yusuf.dao.ProductDAO;
import com.yusuf.pojo.ChartItem;
import com.yusuf.pojo.User;
import com.yusuf.spring.exception.AdException;
@Controller
public class CheckoutController {
	@RequestMapping(value = "/Checkout.htm",method = RequestMethod.POST)
	protected String doSubmitAction(@ModelAttribute("cartitem") ChartItem cartitem, BindingResult result,HttpServletRequest htp) throws Exception {
		
		if (result.hasErrors()) {
			return "CustomerCart";
		}

		try {
			System.out.print("test");
			CartDAO userDao = new CartDAO();
			ProductDAO pDao = new ProductDAO();
			System.out.print("test1");
			
			HttpSession session = htp.getSession();
			System.out.println("from page: "+htp.getParameter("productID"));
			long orderStatus=Long.parseLong(htp.getParameter("orderStatus"));
			long total=Long.parseLong(htp.getParameter("total"));
			long cartId=Long.parseLong(htp.getParameter("cartId"));
			System.out.println("cccccccccccc"+cartId);

			User uid= (User)session.getAttribute("user");
			long id=uid.getUserId();
		
			long productID= Long.parseLong(htp.getParameter("productID"));
			long quantity= Long.parseLong(htp.getParameter("quantity"));
		    long pp=pDao.validate(productID, quantity);
		if(pp<quantity)
		{
			return "Error";
		}
		
		userDao.update(orderStatus,cartId);
		long deductedquantity=pp-quantity;
		pDao.update(productID, deductedquantity);
		
		
		
		} catch (AdException e) {
			System.out.println("Exception: " + e.getMessage());
		}

	return "CustomerCheckout";
	}

	
	
	
	
	

	@RequestMapping(value = "/Checkout.htm",method = RequestMethod.GET)
public ModelAndView initializeForm(@RequestParam("orderStatus")long orderStatus,@RequestParam("total")long total,@RequestParam("quantity")long quantity,@RequestParam("cartId")long cartId,@RequestParam("productID")long productID,@ModelAttribute("cartitem") ChartItem cartitem, BindingResult result)throws Exception {
		
		
	    
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("orderStatus",orderStatus);
		mv.addObject("total",total);
		mv.addObject("cartId",cartId);
		mv.addObject("productID",productID);
		mv.addObject("quantity", quantity);
	    mv.setViewName("FinalPaymentPage");
		return mv;
	}
	
	
	
	
	
	
}
