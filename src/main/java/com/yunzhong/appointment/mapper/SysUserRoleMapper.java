package com.yunzhong.appointment.mapper;


import org.apache.ibatis.annotations.Delete;
import com.yunzhong.appointment.entity.SysUserRole;

public interface SysUserRoleMapper {
    int deleteByPrimaryKey(String urId);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(String urId);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
    /**
     * 
     * @methodName removeByUserId
     * @description 根据用户主键删除用户角色表中数据
     * @author 石洪刚
     * @time 2017年10月5日 下午7:34:38
     * @param id
     */
    @Delete("delete from sys_user_role where user_id = #{id}")
	void removeByUserId(String id);
    
    /**
     * 
     * @methodName deleteByUserId
     * @description 删除用户的角色信息
     * @author 石洪刚
     * @time 2017年10月6日 下午2:29:38
     * @param userId
     */
    @Delete("delete from sys_user_role where user_id = #{userId}")
	void deleteByUserId(String userId);
    /**
     * 删除角色用户中间表的相关信息
     * @param id roleId
     */
    @Delete("DELETE FROM sys_user_role where role_id=#{param1}")
	void removeByRoleId(String id);
}