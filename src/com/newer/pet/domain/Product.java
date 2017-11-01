package com.newer.pet.domain;

import java.math.BigDecimal;
import java.util.List;

/**
 * 分类(名称、很多商品)
 * 
 * @author acer
 *
 */
public class Product {
	// 编号
	private int pid;

	// 商品名称
	private String pname;
	// 价格
	private BigDecimal price;
	// 商品描述
	private String pdescription;
	// 库存
	private Integer pquantity;
	// 销量
	private int psales;
	// 商品图片
	private String pic;
	// 类别
	private Category category;

	public Product() {
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", pdescription=" + pdescription
				+ ", pquantity=" + pquantity + ", psales=" + psales + ", pic=" + pic + ", category=" + category + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getPdescription() {
		return pdescription;
	}

	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}

	public Integer getPquantity() {
		return pquantity;
	}

	public void setPquantity(Integer pquantity) {
		this.pquantity = pquantity;
	}

	public int getPsales() {
		return psales;
	}

	public void setPsales(int psales) {
		this.psales = psales;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
