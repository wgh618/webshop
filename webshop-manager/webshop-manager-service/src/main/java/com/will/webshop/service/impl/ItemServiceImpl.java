package com.will.webshop.service.impl;

import com.will.webshop.domain.WsItem;
import com.will.webshop.mapper.WsItemMapper;
import com.will.webshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:ItemServiceImpl
 * Description:
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2017-12-16
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private WsItemMapper wsItemMapper;

    @Override
    public WsItem getItemById(long itemId) {
        return wsItemMapper.selectByPrimaryKey(itemId);
    }
}
