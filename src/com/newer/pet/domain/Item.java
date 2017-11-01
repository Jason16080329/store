package com.newer.pet.domain;

import java.math.BigDecimal;
import java.text.Bidi;

public class Item {
	//订单中某一项的编号
	private int id;
	//流水号
	private int num;
	
	//商品
	private Product product;
	//商品数量
	private int quantity;
	
	//总价
	private BigDecimal total;
}
