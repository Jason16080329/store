package com.newer.pet.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.newer.pet.domain.Product;

public interface ProductMapper {
	
	@Select("select * from product order by pname")
	List<Product> findAll();
}
