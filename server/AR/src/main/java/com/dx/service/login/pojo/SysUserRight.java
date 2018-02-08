package com.dx.service.login.pojo;

/**
 * 用户权限POJO实现类
 * Created by Administrator on 2018-2-8.
 */
public class SysUserRight {


    /**
     *
     */
    protected static final long serialVersionUID = 3364383139352334943L;

    /**
     * 编号
     */
    protected String id;

    /**
     * 帐号编号
     */
    protected String userId;

    /**
     * 类型
     */
    protected int type;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
        return id + "," + userId + "," + type + "," + roleId + "," + rightKey;
    }


}
