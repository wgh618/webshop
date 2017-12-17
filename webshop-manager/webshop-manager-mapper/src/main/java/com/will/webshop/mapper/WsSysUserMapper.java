package com.will.webshop.mapper;

import com.will.webshop.domain.WsSysUser;
import com.will.webshop.domain.WsSysUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName:WsItemMapper
 * Description:系统用户Mapper
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2017-12-16
 */
public interface WsSysUserMapper {
    /**
     * 根据条件计算结果数量
     * @param example
     * @return
     */
    long countByExample(WsSysUserExample example);

    /**
     * 根据条件删除
     * @param example
     * @return
     */
    int deleteByExample(WsSysUserExample example);

    /**
     * 根据主键删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入
     * @param record
     * @return
     */
    int insert(WsSysUser record);

    /**
     * 根据条件查找
     * @param example
     * @return
     */
    List<WsSysUser> selectByExample(WsSysUserExample example);

    /**
     * 根据主键查找
     * @param id
     * @return
     */
    WsSysUser selectByPrimaryKey(Long id);

    /**
     * 根据主键更新不为空的字段
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(WsSysUser record);

    /**
     * 根据主键更新全部字段
     * @param record
     * @return
     */
    int updateByPrimaryKey(WsSysUser record);
}