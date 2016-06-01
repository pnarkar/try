package com.yusuf.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yusuf.dao.ProductDAO;
import com.yusuf.dao.UserDAO;
import com.yusuf.pojo.Product;
import com.yusuf.pojo.User;
import com.yusuf.spring.exception.AdException;

@Controller
public class DeleteUser {
	@RequestMapping( value = "/DeleteUser.htm",method=RequestMethod.GET)
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        UserDAO product = null;
        List productList = null;
        List userIdList = new ArrayList();
        

        try {
            product = new UserDAO();
            productList = product.select();

            Iterator productIterator = productList.iterator();

            while (productIterator.hasNext())
            {
                User pro = (User) productIterator.next();
                userIdList.add(pro);

            }
        } catch (AdException e) {
            System.out.println(e.getMessage());
        }

        ModelAndView mv = new ModelAndView("DeleteUser", "user", userIdList);
        return mv;
    }
}
