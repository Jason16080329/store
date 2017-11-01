package com.newer.pet.domain;
/**
 * 所有实体类的基类
 * 
 */
import java.io.Serializable;

public abstract class BaseEntity implements Serializable{
	/**
	 * 主键
	 * 可以让实体类继承他，就不用每个实体类分别设置主键了。
	 */
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
