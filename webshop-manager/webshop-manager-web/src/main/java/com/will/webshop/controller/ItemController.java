package com.will.webshop.controller;

import com.will.webshop.common.pojo.EesyUiDataGridResult;
import com.will.webshop.domain.WsItem;
import com.will.webshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:ItemController
 * Description:商品Controller
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2017-12-16
 */
@Controller

public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/manage/item/{itemId}")
    @ResponseBody
    public WsItem getItemById(@PathVariable Long itemId) {
        return itemService.getItemById(itemId);
    }

    @RequestMapping("/item/list")
    @ResponseBody
    public EesyUiDataGridResult getItemList(Integer page, Integer rows) {
        return itemService.listAllItem(page, rows);
    }
}
