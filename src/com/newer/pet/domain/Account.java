package com.newer.pet.domain;

import java.util.LinkedList;
import java.util.List;

/**
 * 账号
 * 
 * @author acer
 *
 */
public class Account {
	// 基本信息
	private Integer uid;
	private String username;
	
	private String password;
	private String sex;
	private Integer age;
	private String email;
	private String phone;
	private String address;

	// 购物车
	private Cart cart;

	// 订单
	private List<Order> orderList = new LinkedList<>();
	
	/**
	 * 用户的地址（内部内，只在Account这个类中用到，因为可能有多个地址）
	 * @author acer
	 *
	 */
	public static class Address{
		String province;
		String city;
		String street;
		String name;
		String phone;
	}
	
	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

}
