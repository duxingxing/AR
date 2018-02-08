package com.dx.service.login.pojo;

/**
 * 角色权限POJO实现类
 * Created by Administrator on 2018-2-8.
 */
public class SysRoleRight {


    /**
     *
     */
    protected static final long serialVersionUID = -6100854345272373194L;

    /**
     * 编号
     */
    protected String id;

    /**
     * 角色编号
     */
    protected String roleId;

    /**
     * 权限字
     */
    protected String rightKey;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRightKey() {
        return rightKey;
    }

    public void setRightKey(String rightKey) {
        this.rightKey = rightKey;
    }

    public String toString() {
        return id + "," + roleId + "," + rightKey;
    }


}
