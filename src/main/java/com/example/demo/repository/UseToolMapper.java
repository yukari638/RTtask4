package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.UseTool;

@Mapper
public interface UseToolMapper {
	
	List<UseTool> selectAll();
}
