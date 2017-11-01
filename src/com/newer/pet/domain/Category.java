package com.newer.pet.domain;

import java.util.LinkedList;
import java.util.List;

/**
 * 分类
 * @author acer
 *
 */
public class Category {
	//编号
	private String cid;
	//类别名称
	private String cname;
	//类别描述
	private String cdescription;
	//该分类下所有商品
	private List<Product> plist = new LinkedList<>();
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	//在分类中加入新的产品
	public void addProduct(Product p){
		plist.add(p);
	}
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCdescription() {
		return cdescription;
	}
	public void setCdescription(String cdescription) {
		this.cdescription = cdescription;
	}
	public List<Product> getPlist() {
		return plist;
	}
	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}
	
	
	
	
	
}
