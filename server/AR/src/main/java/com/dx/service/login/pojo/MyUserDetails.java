package com.dx.service.login.pojo;

import com.dx.data.mybatis.mapper.RightMapper;
import com.dx.data.mybatis.mapper.RoleMapper;
import com.dx.util.SpringUtil;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * Created by Administrator on 2018-2-8.
 */
public class MyUserDetails implements UserDetails {
    private SysUser sysUser;
    private Collection<? extends GrantedAuthority> list;

    public MyUserDetails(SysUser sysUser) {
        this.sysUser = sysUser;

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (null == list) {
            RightMapper rightMapper = (RightMapper) SpringUtil.getBean("rightMapper");
            RoleMapper roleMapper = (RoleMapper) SpringUtil.getBean("roleMapper");

            List<GrantedAuthority> rights = rightMapper.getRightsByUserId(getUsername());
            List<GrantedAuthority> roles = roleMapper.getRolesByUserId(getUsername());
            rights.addAll(roles);
            list = rights;
        }

        return list;
    }

    @Override
    public String getPassword() {
        return sysUser.getPassword();
    }

    @Override
    public String getUsername() {
        return sysUser.getLoginId();
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
