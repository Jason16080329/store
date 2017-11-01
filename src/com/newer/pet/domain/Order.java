package com.newer.pet.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单
 * @author acer
 *
 */
public class Order {
	private String userid;
	//下订单用户
	private String username;
	//订单日期
	private Date orderDate;
	//订单总金额
	private BigDecimal totalPrice;
	
}
