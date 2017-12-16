package com.will.webshop.mapper;

import com.will.webshop.domain.WsItemCat;
import com.will.webshop.domain.WsItemCatExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName:WsItemCatMapper
 * Description:商品类别Mapper
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2017-12-16
 */
public interface WsItemCatMapper {
    /**
     * 根据条件计算结果数量
     * @param example
     * @return
     */
    long countByExample(WsItemCatExample example);

    /**
     * 根据条件删除
     * @param example
     * @return
     */
    int deleteByExample(WsItemCatExample example);

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
    int insert(WsItemCat record);

    /**
     * 根据条件查找
     * @param example
     * @return
     */
    List<WsItemCat> selectByExample(WsItemCatExample example);

    /**
     * 根据主键查找
     * @param id
     * @return
     */
    WsItemCat selectByPrimaryKey(Long id);

    /**
     * 根据主键更新不为空的字段
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(WsItemCat record);

    /**
     * 根据主键更新全部字段
     * @param record
     * @return
     */
    int updateByPrimaryKey(WsItemCat record);
}