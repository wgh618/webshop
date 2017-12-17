package com.will.webshop.controller;

import com.will.webshop.domain.WsItem;
import com.will.webshop.domain.WsSysUser;
import com.will.webshop.service.SysUserService;
import com.will.webshop.service.impl.ItemServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:LoginController
 * Description:登录Controller
 *
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2017-12-17
 */
@Controller
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "username", required = true) String username,
                        @RequestParam(value = "password", required = true) String password,
                        Model model) {
        try {
            //shiro
            Subject user = SecurityUtils.getSubject();
            password = DigestUtils.md5DigestAsHex(password.getBytes());
            UsernamePasswordToken token = new UsernamePasswordToken(username,password);
            token.setRememberMe(true);
            user.login(token);
        } catch (Exception ex){
            logger.error("登录失败", ex.toString());
            model.addAttribute("msg","账户或密码不正确");
            return "login";
        }
        logger.error("{}登录成功", username);
        return "index";
    }

    @RequestMapping("/manage/index")
    public String getItemById() {
        return "index";
    }

    @RequestMapping(value = "/manage/logout")
    public String logout() {
        Subject user = SecurityUtils.getSubject();
        user.logout();
        return "login";
    }

    @RequestMapping(value = "/manage/save")
    public void save() {
        WsSysUser user = new WsSysUser();
        user.setUserName("test");
        user.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));
        user.setRealName("TEST");
        user.setStatus(Byte.decode("0"));
        user.setCreated(new Date());
        user.setUpdated(new Date());
        sysUserService.saveSysUser(user);
    }
}
