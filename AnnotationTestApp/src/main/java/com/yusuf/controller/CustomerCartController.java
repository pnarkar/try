package com.yusuf.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yusuf.dao.CartDAO;
import com.yusuf.dao.ProductDAO;
import com.yusuf.pojo.ChartItem;
import com.yusuf.pojo.Product;
import com.yusuf.pojo.User;
import com.yusuf.spring.exception.AdException;
@Controller

public class CustomerCartController {


	@RequestMapping(value="/CustomerCart.htm",method=RequestMethod.GET)
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        CartDAO cd = null;
        List productList = null;
        List userIdList = new ArrayList();
        HttpSession session = request.getSession();
        try {
            cd = new CartDAO();
            User uid= (User)session.getAttribute("user");
			long id=uid.getUserId();
            productList = cd.list(id);

            Iterator productIterator = productList.iterator();

            while (productIterator.hasNext())
            {
                ChartItem pro = (ChartItem) productIterator.next();
                userIdList.add(pro);

            }
        } catch (AdException e) {
            System.out.println(e.getMessage());
        }

        ModelAndView mv = new ModelAndView("CustomerCart", "cartitem", userIdList);
        return mv;
    }
	
	
	@RequestMapping(value="/viewOrder.htm",method=RequestMethod.GET)
    protected ModelAndView handleRequestInternal1(HttpServletRequest request, HttpServletResponse response) throws Exception {
        CartDAO cd = null;
        List productList = null;
        List userIdList = new ArrayList();
        HttpSession session = request.getSession();
        try {
            cd = new CartDAO();
            User uid= (User)session.getAttribute("user");
			long id=uid.getUserId();
            productList = cd.viewO(id);

            Iterator productIterator = productList.iterator();

            while (productIterator.hasNext())
            {
                ChartItem pro = (ChartItem) productIterator.next();
                userIdList.add(pro);

            }
        } catch (AdException e) {
            System.out.println(e.getMessage());
        }

        ModelAndView mv = new ModelAndView("ViewSellerOrder", "cartitem", userIdList);
        return mv;
    }
	
	
	

}
