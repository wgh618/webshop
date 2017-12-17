package com.will.webshop.service;

import com.will.webshop.domain.WsSysUser;

/**
 * ClassName:SysUserService
 * Description:系统用户Service
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2017-12-17
 */
public interface SysUserService {
    /**
     * 根据用户名查找用户
     * @param name
     * @return
     */
    public WsSysUser listSysUserByName(String name);

    /**
     * 插入系统用户
     * @param user
     */
    public void saveSysUser(WsSysUser user);
}
