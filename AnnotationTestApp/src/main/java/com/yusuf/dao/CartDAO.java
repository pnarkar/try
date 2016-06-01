package com.yusuf.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.yusuf.pojo.ChartItem;
import com.yusuf.pojo.Product;
import com.yusuf.pojo.User;
import com.yusuf.spring.exception.AdException;

public class CartDAO  extends DAO{

	public CartDAO()
	{
		
	}
	  
	 public ChartItem create(long Quantity,long productId,long UserId,long orderStatus,long total,long price)
	            throws AdException {
	        try {
	            begin();
	            System.out.println("inside DAO");
	            
	           //ShoppingCart sc=new ShoppingCart(user);
	           // User us=new User(firstname,lastname,password,username , UserType);
	            Query q = getSession().createQuery("from Product where productID = :productID");
				q.setLong("productID", productId);
				//q.setLong("0", orderStatus);
				Product product = (Product)q.uniqueResult();
				
				long  sid=product.getUser().getUserId();
				
				
//				Query q1 = getSession().createQuery("select price from Product where productID = :productID");
//				//q.setLong("productID", productId);
//				Product product1 = (Product)q1.uniqueResult();
				
	            User u = new User(UserId);
	            
	            
	           ChartItem c = new ChartItem(Quantity);
	           c.setOrderStatus(0);
	           c.setProduct(product);
	           c.setShoppingcart(UserId);
	           long p= Long.parseLong(product.getProductprice());
	           c.setPrice(p);
	          c.setTotal(Quantity*p);
	            
	           // us.setSc(sc);
	            
	           // sc.setUser(us);
	            
	            getSession().save(c);
	            
	            commit();
	            return c;
	        } catch (HibernateException e) {
	            rollback();
	            //throw new AdException("Could not create user " + username, e);
	            throw new AdException("Exception while creating user: " + e.getMessage());
	        }
	    }
	 public ChartItem viewOrder(long UserId)
	            throws AdException {
	        try {
	            begin();
	            System.out.println("inside DAO");
	            
	           //ShoppingCart sc=new ShoppingCart(user);
	           // User us=new User(firstname,lastname,password,username , UserType);
	            Query q = getSession().createQuery("from ChartItem where shoppingcart = :userId and orderStatus=1");
				q.setLong("userId", UserId);
				//q.setLong("0", orderStatus);
				ChartItem product = (ChartItem)q.uniqueResult();
				
				//long  sid=product.getUser().getUserId();
				
				
//				Query q1 = getSession().createQuery("select price from Product where productID = :productID");
//				//q.setLong("productID", productId);
//				Product product1 = (Product)q1.uniqueResult();
				
//	            User u = new User(UserId);
//	            
//	            
//	           ChartItem c = new ChartItem(Quantity);
//	           c.setOrderStatus(0);
//	           c.setProduct(product);
//	           c.setShoppingcart(UserId);
//	           long p= Long.parseLong(product.getProductprice());
//	           c.setPrice(p);
//	          c.setTotal(Quantity*p);
	            
	           // us.setSc(sc);
	            
	           // sc.setUser(us);
	            
	            getSession().save(product);
	            
	            commit();
	            return product;
	        } catch (HibernateException e) {
	            rollback();
	            //throw new AdException("Could not create user " + username, e);
	            throw new AdException("Exception while creating user: " + e.getMessage());
	        }
	    }
	 public List viewO(long UserId) throws AdException {
		    try {
		    	
		    	
		        begin();
		        Query q = getSession().createQuery("from ChartItem where shoppingcart = :UserId and orderStatus=1");
		       // Query q = getSession().createQuery("from ChartItem where Shoppingcart= :UserId and orderStatus=:orderStatus");
		        q.setLong("UserId", UserId);
		       // q.setLong("UserId", UserId);
		       // q.setLong("orderStatus", 0);
		        List list = q.list();
		        
		        commit();
		        return list;
		    } catch (HibernateException e) {
		        rollback();
		        throw new AdException("Could not list the ChartItem", e);
		    }
}
	 public void delete(long cartId)
	            throws AdException {
	        try {
	            begin();
	            System.out.println("inside DAO");
	            
	          
	            Query q = getSession().createQuery("delete ChartItem where cartId = :cartId");
				q.setLong("cartId", cartId);
				q.executeUpdate();
          
	            commit();

	        } catch (HibernateException e) {
	            rollback();
	            //throw new AdException("Could not create user " + username, e);
	            throw new AdException("Exception while creating user: " + e.getMessage());
	        }
	    }
	 
	 public List list(long UserId) throws AdException {
		    try {
		    	
		    	
		        begin();
		        Query q = getSession().createQuery("from ChartItem where shoppingcart= :UserId and orderStatus=:orderStatus");
		        q.setLong("UserId", UserId);
		        q.setLong("orderStatus", 0);
		        List list = q.list();
		        
		        commit();
		        return list;
		    } catch (HibernateException e) {
		        rollback();
		        throw new AdException("Could not list the ChartItem", e);
		    }
}
	 public List list1() throws AdException {
		    try {
		    	
		    	
		        begin();
		        Query q = getSession().createQuery("from ChartItem where orderStatus=:orderStatus");
		       // q.setLong("UserId", UserId);
		        q.setLong("orderStatus", 1);
		        List list = q.list();
		        
		        commit();
		        return list;
		    } catch (HibernateException e) {
		        rollback();
		        throw new AdException("Could not list the ChartItem", e);
		    }
}
	 public void update(long orderStatus , long cartId)
	            throws AdException {
	        try {
	            begin();
	            System.out.println("inside DAO");
	            
	           //ShoppingCart sc=new ShoppingCart(user);
	           // User us=new User(firstname,lastname,password,username , UserType);
	            Query q = getSession().createQuery("update ChartItem set orderStatus = :orderStatus where cartId = :cartId");
				q.setLong("orderStatus", 1);
				q.setLong("cartId", cartId);
				q.executeUpdate();
//				Product product = (Product)q.uniqueResult();
//				
//				long  sid=product.getUser().getUserId();
//				
//				
////				Query q1 = getSession().createQuery("select price from Product where productID = :productID");
////				//q.setLong("productID", productId);
////				Product product1 = (Product)q1.uniqueResult();
//				
//	            User u = new User(UserId);
//	            
//	            
//	           ChartItem c = new ChartItem(Quantity);
//	           c.setProduct(product);
//	           c.setShoppingcart(UserId);
//	           long p= Long.parseLong(product.getProductprice());
//	           c.setPrice(p);
//	            
//	           // us.setSc(sc);
//	            
//	           // sc.setUser(us);
	            
//	            getSession().save(c);
//	            
	            commit();
//	            return c;
	        } catch (HibernateException e) {
	            rollback();
	            //throw new AdException("Could not create user " + username, e);
	            throw new AdException("Exception while creating user: " + e.getMessage());
	        }
	    }
	 
}
