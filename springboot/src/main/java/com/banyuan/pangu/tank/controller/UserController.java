package com.banyuan.pangu.tank.controller;

import com.banyuan.pangu.tank.common.ResponseVO;
import com.banyuan.pangu.tank.domain.UserDO;
import com.banyuan.pangu.tank.domain.UserDTO;
import com.banyuan.pangu.tank.domain.query.QueryUserInfoDTO;
import com.banyuan.pangu.tank.domain.query.QueryUserListDTO;
import com.banyuan.pangu.tank.domain.query.RegisterDTO;
import com.banyuan.pangu.tank.service.user.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

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
    private ResponseVO login(@RequestBody QueryUserInfoDTO queryUserInfoDTO) {
        logger.error("请求登录...");
        logger.error("Request Body params is : " + queryUserInfoDTO);
        return userService.queryUserInfoById(queryUserInfoDTO.getUserId());
    }

    /**
     * 查询用户列表
     * @return
     */
    @PostMapping("queryUserList")
    private ResponseVO queryUserList(@Validated @RequestBody QueryUserListDTO queryUserListDTO) {
        logger.error("查询用户列表...");
        return userService.queryUserList(queryUserListDTO);
    }

    /**
     * 注册
     * @param registerDTO
     */
    @PostMapping("register")
    private ResponseVO register(@RequestBody RegisterDTO registerDTO) {
        logger.error("用户注册...");
        return userService.register(registerDTO);
    }
    
    
}
