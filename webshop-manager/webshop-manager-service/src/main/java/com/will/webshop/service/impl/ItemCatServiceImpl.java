package com.will.webshop.service.impl;

import com.will.webshop.domain.WsItemCat;
import com.will.webshop.domain.WsItemCatExample;
import com.will.webshop.mapper.WsItemCatMapper;
import com.will.webshop.service.ItemCatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:ItemCatServiceImpl
 * Description:
 *
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2018-01-06
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {
    private static final Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);

    @Resource
    private WsItemCatMapper wsItemCatMapper;
    
    @Override
    public List<WsItemCat> getItemCatList(Long parentId) throws Exception {
        WsItemCatExample example = new WsItemCatExample();
        WsItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        return wsItemCatMapper.selectByExample(example);
    }
}
