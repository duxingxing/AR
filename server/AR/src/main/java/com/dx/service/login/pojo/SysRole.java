package com.dx.service.login.pojo;

import org.springframework.security.core.GrantedAuthority;

/**
 * 角色 pojo
 * Created by Administrator on 2018-2-2.
 */
public class SysRole implements GrantedAuthority {


    /**
     *
     */
    protected static final long serialVersionUID = 5778268181094959240L;

    /**
     * 编号
     */
    protected String id;

    /**
     * 角色名称
     */
    protected String name;

    /**
     * 角色描述
     */
    protected String descript;

    /**
     * 系统固有
     */
    protected Integer xtgy;

    /**
     * 是否有效
     */
    protected Integer valid;

    /**
     * 显示顺序
     */
    protected Integer order;

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

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Integer getXtgy() {
        return xtgy;
    }

    public void setXtgy(Integer xtgy) {
        this.xtgy = xtgy;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String toString() {
        return id + "," + name + "," + descript + "," + xtgy + "," + valid + "," + order;
    }


    @Override
    public String getAuthority() {
        return "ROLE_"+this.name;
    }
}
