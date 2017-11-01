package com.newer.pet.domain;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Set;

/**
 * 购物车
 * @author acer
 *
 */
public class Cart {
	//主键
	private int cartid;
	//谁的购物车
	private Account account;
	private BigDecimal total;
	//商品、数量
	HashMap<Product,Integer> map = new HashMap<Product,Integer>();
	
	public Cart() {
	
	}
	/*
	 * 购物车总金额
	 */
	public BigDecimal getTotal(){
		Set<Product> keys = map.keySet();
		for (Product p : keys) {
			int n = map.get(p);
			total = total.add(p.getPrice().multiply(BigDecimal.valueOf(n)));
		}
		return BigDecimal.valueOf(0);
	}
	
	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public HashMap<Product, Integer> getMap() {
		return map;
	}

	public void setMap(HashMap<Product, Integer> map) {
		this.map = map;
	}
	
}
