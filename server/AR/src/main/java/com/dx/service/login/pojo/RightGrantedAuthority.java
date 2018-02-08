package com.dx.service.login.pojo;

import org.springframework.security.core.GrantedAuthority;

/** 权限类
 * Created by Administrator on 2018-2-2.
 */
public class RightGrantedAuthority implements GrantedAuthority {
    private String authority;
    public void setAuthority( String authority){
        this.authority=authority;
    }
    @Override
    public String getAuthority() {
        return authority;
    }
}
