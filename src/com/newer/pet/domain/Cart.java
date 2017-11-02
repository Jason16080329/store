package com.newer.pet.domain;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Set;

/**
 * 购物车（强实体、弱实体）
 * @author acer
 *
 */
public class Cart {
	
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
	/*
	 * 购物车内有多少东西
	 */
	public int getSize(){
		return map.size();
	}


	public HashMap<Product, Integer> getMap() {
		return map;
	}

	public void setMap(HashMap<Product, Integer> map) {
		this.map = map;
	}
	
}
