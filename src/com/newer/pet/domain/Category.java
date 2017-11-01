package com.newer.pet.domain;
/**
 * 分类
 * @author acer
 *
 */
public class Category {
	private String cid;
	//类别名称
	private String cname;
	//类别描述
	private String cdescription;
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
	
	
}
