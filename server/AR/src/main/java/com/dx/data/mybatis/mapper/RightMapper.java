package com.dx.data.mybatis.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

/**
 * Created by Administrator on 2018-2-8.
 */
@Mapper
public interface RightMapper {


        public List<GrantedAuthority> getRightsByUserId(@Param("userId") String userId);




}
