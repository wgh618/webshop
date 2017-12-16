package com.will.webshop.mapper;

import com.will.webshop.domain.WsItem;
import com.will.webshop.domain.WsItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName:WsItemMapper
 * Description:商品Mapper
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2017-12-16
 */
public interface WsItemMapper {
    /**
     * 根据条件计算结果数量
     * @param example
     * @return
     */
    long countByExample(WsItemExample example);

    /**
     * 根据条件删除
     * @param example
     * @return
     */
    int deleteByExample(WsItemExample example);

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
    int insert(WsItem record);

    /**
     * 根据条件查找
     * @param example
     * @return
     */
    List<WsItem> selectByExample(WsItemExample example);

    /**
     * 根据主键查找
     * @param id
     * @return
     */
    WsItem selectByPrimaryKey(Long id);

    /**
     * 根据主键更新不为空的字段
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(WsItem record);

    /**
     * 根据主键更新全部字段
     * @param record
     * @return
     */
    int updateByPrimaryKey(WsItem record);
}