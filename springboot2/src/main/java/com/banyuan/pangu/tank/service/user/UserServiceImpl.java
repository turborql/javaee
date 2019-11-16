package com.banyuan.pangu.tank.service.user;

import com.banyuan.pangu.tank.domain.UserDO;
import com.banyuan.pangu.tank.mapper.user.UserMapper;
import org.springframework.stereotype.Service;

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
 * @date 2019-11-16 11:41
 * 文件描述:
 *
 */
@Service
public class UserServiceImpl {


    @Resource
    private UserMapper userMapper;

    /**
     * 通过userId查询用户信息
     * @param userId
     * @return
     */
    public UserDO queryUserInfoById(Long userId) {
        return userMapper.queryUserInfoById(userId);
    }
}
