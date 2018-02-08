package com.dx.service.login.pojo;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * 用户POJO类
 * Created by Administrator on 2018-1-29.
 */

public class SysUser {

    /**
     *
     */
    protected static final long serialVersionUID = -4534104620500073463L;
    /**
     * 编号
     */
    protected String id;

    /**
     * 名称
     */
    protected String name;

    /**
     * 有效状态(int类型)
     */
    protected int nValid;

    /**
     * 显示顺序
     */
    protected int order;


    /**
     * 登录标识
     */
    protected String loginId;

    /**
     * 密码
     */
    protected String password;

    /**
     * email
     */
    protected String email;

    /**
     * 姓名简拼
     */
    protected String xmjp;

    /**
     * 单位id
     */
    protected String corpId;

    /**
     * 部门id
     */
    protected String deptId;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getXmjp() {
        return xmjp;
    }

    public void setXmjp(String xmjp) {
        this.xmjp = xmjp;
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public long getPK() {
        return -1;
    }

    public String getUid() {
        return this.loginId;
    }

    public void setPK(long id) {
    }

    public void setUid(String uid) {
        this.loginId = uid;
    }

    public String toString() {
        return loginId + "," + password + "," + xmjp + "," + email + "," + corpId + "," + deptId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isValid() {
        if (this.getnValid() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void setValid(boolean valid) {
        if (valid) {
            this.setnValid(1);
        } else {
            this.setnValid(2);
        }
    }

    public int getnValid() {
        return nValid;
    }

    public void setnValid(int nValid) {
        this.nValid = nValid;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    /**
     * 获得显示名称，主要用于组织机构需要显示名称的时候<br>
     * 此方法获得的数据不与数据库中的数据相对应
     *
     * @return 需要显示的名称
     */
    public String getShowName() {
        return getName();
    }
}
