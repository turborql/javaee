package com.banyuan.pangu.tank.controller;

import com.banyuan.pangu.tank.domain.UserDO;
import com.banyuan.pangu.tank.domain.UserDTO;
import com.banyuan.pangu.tank.service.user.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/***
 *
 *          ┌─┐       ┌─┐
 *       ┌──┘ ┴───────┘ ┴──┐
 *       │                 │
 *       │       ───       │
 *       │  ─┬┘       └┬─  │
 *       │                 │
 *       │       ─┴─       │
 *       │                 │
 *       └───┐         ┌───┘
 *           │         │
 *           │         │
 *           │         │
 *           │         └──────────────┐
 *           │                        │
 *           │                        ├─┐
 *           │                        ┌─┘    
 *           │                        │
 *           └─┐  ┐  ┌───────┬──┐  ┌──┘         
 *             │ ─┤ ─┤       │ ─┤ ─┤         
 *             └──┴──┘       └──┴──┘ 
 *               神兽保佑  代码无BUG!
 *
 *
 * @author : wangjia
 * @date 2019-11-16 10:52
 * 文件描述:
 *
 */
@RestController
public class UserController {

    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserServiceImpl userService;


    /**
     * 用户登录
     * @return
     */
    @PostMapping("login")
    private UserDO login() {
        logger.error("请求登录...");
        return userService.queryUserInfoById(2L);

    }
}
