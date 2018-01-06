package com.will.webshop.service;

import com.will.webshop.domain.WsItemCat;

import java.util.List;

/**
 * ClassName:ItemCatService
 * Description:商品类目Service
 *
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2018-01-06
 */
public interface ItemCatService {
    /**
     * 查询所有商品类目
     * @param parentId
     * @return
     * @throws Exception
     */
    public List<WsItemCat> getItemCatList(Long parentId) throws Exception;
}
