package com.will.webshop.service;

import com.will.webshop.common.pojo.EesyUiDataGridResult;
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
     * @param itemId
     * @return
     */
    WsItem getItemById(long itemId);

    /**
     * 查询全部商品（分页）
     * @param page
     * @param rows
     * @return
     */
    EesyUiDataGridResult listAllItem(int page, int rows);
}
