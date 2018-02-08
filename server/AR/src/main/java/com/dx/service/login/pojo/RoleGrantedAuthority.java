package com.dx.service.login.pojo;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by Administrator on 2018-2-8.
 */
public class RoleGrantedAuthority implements GrantedAuthority {
    //
    private  String authority;
    public void setAuthority( String authority){
        this.authority=authority;
    }
    @Override
    public String getAuthority() {
        //角色必须以ROLE_ 开头
        return "ROLE_"+authority;
    }
}
