package com.dx.data.mybatis.mapper;



import org.apache.ibatis.annotations.Mapper;
import org.springframework.security.core.GrantedAuthority;


import java.util.List;
@Mapper
public interface RoleMapper {
    public List<GrantedAuthority> getRolesByUserId(String userId);
}
