package com.dx.data.mybatis.mapper;

import com.dx.service.login.pojo.SysUser;
import com.dx.service.login.pojo.SysUserRight;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018-2-8.
 */
@Mapper
public interface UserMapper {
    public void setUserPwd(@Param("userId") String userId, @Param("sPwdMd5") String sPwdMd5);

    public void saveUserRight(SysUserRight userRight);

    public void updateRightUser(@Param("oldRightKey") String oldRightKey, @Param("newRightKey") String newRightKey);

    public void deleteUserRightsByRole(@Param("userid") String userid, @Param("delRoleList") List<String> delRoleList);

    public void deleteUserRightsByRightKey(@Param("userid") String userid, @Param("rightKeys") List<String> rightKeys);

    public void deleteUser(String id);


    public void insertUser(SysUser user);


    public void updateUser(SysUser user);


    public List<SysUser> getAllUsers();

    public List<SysUser> getUserList(@Param("start") int start, @Param("limit") int limit);

    public void deleteUserRight(String userId);

    public void deleteUsersRight(List<String> userIdList);

    public void deleteUsersSomeRight(@Param("userIdList") List<String> userIdList, @Param("rightKey") String rightKey);

    public void deleteUserList(List<String> userIdList);


    public SysUser getUserById(String userId);

    public SysUser getUserByLoginId( @Param("loginId")String loginId);

    public void updateUserListValid(@Param("userIdList") List<String> userIdList, @Param("valid") boolean valid);


}
