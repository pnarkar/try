package com.yusuf.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.yusuf.pojo.Product;
import com.yusuf.pojo.User;
import com.yusuf.spring.exception.AdException;
//import com.yusuf.spring.pojo.Email;

public class ProductDAO extends DAO {
public ProductDAO()

{
	
}
public Product create(String productDescription ,String productname ,String productprice,long userId,String photoName,long sellerQuantity)
        throws AdException {
    try {
        begin();
        System.out.println("inside DAO");
       // Email email=new Email(emailId);
        User user = new User(userId);
        
       //ShoppingCart sc=new ShoppingCart(user);
        Product p=new Product(productname,productprice, productDescription,photoName, sellerQuantity);
        
       p.setUser(user);
        
        
       // us.setSc(sc);
        
       // sc.setUser(us);
        
        getSession().save(p);
        
        commit();
        return p;
    } catch (HibernateException e) {
        rollback();
        //throw new AdException("Could not create user " + username, e);
        throw new AdException("Exception while creating user: " + e.getMessage());
    }
}
public List list() throws AdException {
    try {
        begin();
        Query q = getSession().createQuery("from Product where sellerQuantity > 0");
        List list = q.list();
        commit();
        return list;
    } catch (HibernateException e) {
        rollback();
        throw new AdException("Could not list the Product", e);
    }
}

public List list2(long userId) throws AdException {
    try {
        begin();
        Query q = getSession().createQuery("from Product where  userId=:userId");
        q.setLong("userId", userId);
        List list = q.list();
        commit();
        return list;
    } catch (HibernateException e) {
        rollback();
        throw new AdException("Could not list the Product", e);
    }
}

public long validate(long productId , long Quantity)
        throws AdException {
    try {
        begin();
        Query q = getSession().createQuery("select sellerQuantity from Product where productId = :productId ");
        q.setLong("productId", productId);
        
        long quantity =  (Long) q.uniqueResult();
        commit();
        return quantity;
    } catch (HibernateException e) {
        rollback();
        throw new AdException("Invalid Entry " + productId, e);
    }
}


public void update(long productId , long Quantity)
        throws AdException {
    try {
        begin();
        System.out.println("inside DAO");
       
       //ShoppingCart sc=new ShoppingCart(user);
       // User us=new User(firstname,lastname,password,username , UserType);
        
        Query q = getSession().createQuery("update Product set sellerQuantity = :Quantity where productId = :productId");
		q.setLong("Quantity",  Quantity);
		
		q.setLong("productId", productId);
		q.executeUpdate();
//		Product product = (Product)q.uniqueResult();
//		
//		long  sid=product.getUser().getUserId();
//		
//		
////		Query q1 = getSession().createQuery("select price from Product where productID = :productID");
////		//q.setLong("productID", productId);
////		Product product1 = (Product)q1.uniqueResult();
//		
//        User u = new User(UserId);
//        
//        
//       ChartItem c = new ChartItem(Quantity);
//       c.setProduct(product);
//       c.setShoppingcart(UserId);
//       long p= Long.parseLong(product.getProductprice());
//       c.setPrice(p);
//        
//       // us.setSc(sc);
//        
//       // sc.setUser(us);
        
//        getSession().save(c);
//        
        commit();
//        return c;
    } catch (HibernateException e) {
        rollback();
        //throw new AdException("Could not create user " + username, e);
        throw new AdException("Exception while creating user: " + e.getMessage());
    }
}



}
