package com.newer.pet.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.newer.pet.domain.Account.Address;

/**
 * 订单
 * @author acer
 *
 */
public class Order {
	//订单id 
	private int oid;
	//订单日期
	private Date orderDate;
	//下订单用户
	private Account account;
	//送货地址(若为空，则使用账号的默认地址)
	private Address address;
	//订单总金额
	private BigDecimal totalPrice;
	//订单列表
	private List<Item> items = new ArrayList<>();
	//总价
	private BigDecimal total;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	
}
