package com.yusuf.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.yusuf.spring.exception.AdException;
import com.yusuf.pojo.ShoppingCart;
//import com.yusuf.spring.pojo.Person;
import com.yusuf.pojo.User;

public class UserDAO extends DAO {

    public UserDAO() {
    }

    public User get(String username)
            throws AdException {
        try {
            begin();
            Query q = getSession().createQuery("from User where name = :username");
            q.setString("username", username);
            User user = (User) q.uniqueResult();
            commit();
            return user;
        } catch (HibernateException e) {
            rollback();
            throw new AdException("Could not get user " + username, e);
        }
    }
    
    public User validate(String username,String password)
            throws AdException {
        try {
            begin();
            Query q = getSession().createQuery("from User where username = :username and password= :password");
            q.setString("username", username);
            q.setString("password", password);
            User user = (User) q.uniqueResult();
            commit();
            return user;
        } catch (HibernateException e) {
            rollback();
            throw new AdException("Invalid User " + username, e);
        }
    }

    
    
    
    public User create(String username, String password,User user, String firstname, String lastname , String UserType)
            throws AdException {
        try {
            begin();
            System.out.println("inside DAO");
            
          // ShoppingCart sc=new ShoppingCart(shoppingcartId);
            User us=new User(firstname,lastname,username,password,UserType);
            
            us.setFirstname(firstname);
            us.setLastname(lastname);
            
          //  us.setSc(sc);
          //  sc.setUser(us);
            
          //  sc.setUser(user);
            
            getSession().save(us);
            
            commit();
            return us;
        } catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create user " + username, e);
            throw new AdException("Exception while creating user: " + e.getMessage());
        }
    }

    public void delete(String username)
            throws AdException {
        try {
            begin();
            System.out.println("inside DAO");
            
          
            Query q = getSession().createQuery("delete User where username = :username");
			q.setString("username", username);
			q.executeUpdate();
      
            commit();

        } catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create user " + username, e);
            throw new AdException("Exception while creating user: " + e.getMessage());
        }
    }
    
    
    public List select()
            throws AdException {
        try {
            begin();
            System.out.println("inside DAO");
            
          
            Query q = getSession().createQuery("from User");
			
            List list = q.list();
	        
	        commit();
	        return list;

        } catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create user " + username, e);
            throw new AdException("Exception while creating user: " + e.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}