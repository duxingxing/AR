package com.dx.data.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Mapper
public interface TestDao {
	public List<Map<String, Object>> list(int i);

}
