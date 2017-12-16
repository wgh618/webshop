package com.will.webshop.service;

import com.will.webshop.domain.WsItem;

/**
 * ClassName:ItemService
 * Description:商品Service
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2017-12-16
 */
public interface ItemService {
    /**
     * 根据主键获取商品
     * @param id
     * @return
     */
    WsItem getItemById(long itemId);
}
