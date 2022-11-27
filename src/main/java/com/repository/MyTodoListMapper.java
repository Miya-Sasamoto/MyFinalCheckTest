package com.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.domain.model.MMyTodoList;

@Mapper
public interface MyTodoListMapper {
	public List<MMyTodoList> selectAll();
	
	public void add(MMyTodoList todo);
	
	public void update(MMyTodoList todo);
	
	public void delete(MMyTodoList todo);

}
