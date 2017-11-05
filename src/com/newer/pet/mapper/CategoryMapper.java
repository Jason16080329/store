package com.newer.pet.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.newer.pet.domain.Category;

/**
 * 产品分类的数据操作
 * @author acer
 *
 */
public interface CategoryMapper {
	
	@Select("select * from category order by cname")
	List<Category> findAll();
}
