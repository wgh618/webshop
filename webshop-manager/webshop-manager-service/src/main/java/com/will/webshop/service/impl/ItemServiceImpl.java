package com.will.webshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.will.webshop.common.pojo.EesyUiDataGridResult;
import com.will.webshop.domain.WsItem;
import com.will.webshop.domain.WsItemExample;
import com.will.webshop.mapper.WsItemMapper;
import com.will.webshop.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:ItemServiceImpl
 * Description:
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2017-12-16
 */
@Service
public class ItemServiceImpl implements ItemService {

    private static final Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);
    @Autowired
    private WsItemMapper wsItemMapper;

    @Override
    public WsItem getItemById(long itemId) {
        return wsItemMapper.selectByPrimaryKey(itemId);
    }

    @Override
    public EesyUiDataGridResult listAllItem(int page, int rows) {
        //查询商品列表
        WsItemExample example = new WsItemExample();
        //分页处理
        PageHelper.startPage(page, rows);
        List<WsItem> list = wsItemMapper.selectByExample(example);
        //创建一个返回值对象
        EesyUiDataGridResult result = new EesyUiDataGridResult();
        result.setRows(list);
        //取记录总条数
        PageInfo<WsItem> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }
}
