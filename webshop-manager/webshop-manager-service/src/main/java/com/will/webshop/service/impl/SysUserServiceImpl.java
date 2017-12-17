package com.will.webshop.service.impl;

import com.will.webshop.domain.WsSysUser;
import com.will.webshop.domain.WsSysUserExample;
import com.will.webshop.mapper.WsSysUserMapper;
import com.will.webshop.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:SysUserServiceImpl
 * Description:
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2017-12-17
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    private static final Logger logger = LoggerFactory.getLogger(SysUserServiceImpl.class);

    @Autowired
    private WsSysUserMapper wsSysUserMapper;

    @Override
    public WsSysUser listSysUserByName(String name) {
        WsSysUserExample example = new WsSysUserExample();
        WsSysUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(name);
        List<WsSysUser> wsSysUsers = wsSysUserMapper.selectByExample(example);
        if (wsSysUsers != null && wsSysUsers.size() > 0) {
            return wsSysUsers.get(0);
        }
        return null;
    }

    @Override
    public void saveSysUser(WsSysUser user) {
        if (user == null) {
            throw new IllegalArgumentException();
        }
        wsSysUserMapper.insert(user);
    }
}
