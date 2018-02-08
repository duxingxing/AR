package com.dx.service.login.pojo;

import org.springframework.security.core.GrantedAuthority;

/**
 * 权限POJO实现类
 * Created by Administrator on 2018-2-2.
 */
public class SysRight implements GrantedAuthority {


    /**
     *
     */
    protected static final long serialVersionUID = 5752266780777400231L;

    /**
     * 权限字
     */
    protected String rightKey;

    /**
     * 权限名称
     */
    protected String name;

    /**
     * 描述信息
     */
    protected String descript;

    /**
     * 显示顺序
     */
    protected Integer order;

    public String getRightKey() {
        return rightKey;
    }

    public void setRightKey(String rightKey) {
        this.rightKey = rightKey;
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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((rightKey == null) ? 0 : rightKey.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SysRight other = (SysRight) obj;
        if (rightKey == null) {
            if (other.rightKey != null)
                return false;
        } else if (!rightKey.equals(other.rightKey))
            return false;
        return true;
    }

    public String toString() {
        return rightKey + "," + name + "," + descript + "," + order;
    }


    @Override
    public String getAuthority() {
        return this.rightKey;
    }
}
