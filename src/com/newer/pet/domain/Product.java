package com.newer.pet.domain;

import java.util.List;

/**
 * 分类(名称、很多商品)
 * @author acer
 *
 */
public class Product {
	//编号
	private int pid;
	//类别id
	private String cid;
	//商品名称
	private String pname;
	//商品描述
	private String pdescription;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	
}
