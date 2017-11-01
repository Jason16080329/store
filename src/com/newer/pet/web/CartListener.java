package com.newer.pet.web;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.newer.pet.domain.Cart;

/**
 * Application Lifecycle Listener implementation class CartListener
 *
 */
@WebListener
public class CartListener implements HttpSessionListener {
	

    /**
     * Default constructor. 
     */
    public CartListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
        //创建会话的时候、创建一个购物车
    	Cart cart = new Cart();
    	se.getSession().setAttribute("cart", cart);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	
    }
	
}
