package com.will.webshop.controller;

import com.will.webshop.domain.WsItemCat;
import com.will.webshop.service.ItemCatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:ItemCatController
 * Description:商品类目Controller
 *
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2018-01-06
 */
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {
    @Resource
    private ItemCatService itemCatService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Map<String, String>> categoryList(@RequestParam(value = "id", defaultValue = "0") Long parentId) {
        List<Map<String, String>> catList = new ArrayList();
        System.out.println("**************");
        //查询数据库
        List<WsItemCat> list = null;
        try {
            list = itemCatService.getItemCatList(parentId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (WsItemCat tbItemCat : list) {
            Map<String, String> node = new HashMap<>(16);
            node.put("id", tbItemCat.getId().toString());
            node.put("text", tbItemCat.getName());
            //如果是父节点的话就设置成关闭状态，如果是叶子节点就是open状态
            node.put("state", tbItemCat.getIsParent() ? "closed" : "open");
            catList.add(node);
        }
        return catList;
    }
}
