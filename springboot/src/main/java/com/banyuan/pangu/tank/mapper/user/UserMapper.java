package com.banyuan.pangu.tank.mapper.user;

import com.banyuan.pangu.tank.domain.UserDO;
import com.banyuan.pangu.tank.domain.UserInfoDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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
 * @date 2019-11-16 11:33
 * 文件描述:
 *
 */
@Mapper
public interface UserMapper {

    /**
     * 通过userId查询用户信息
     * @param userId
     * @return
     */
    UserDO queryUserInfoById(Long userId);

    /**
     * 查询用户列表
     * @return
     */
    List<UserDO> queryUserList();

    /**
     * 查用user表
     * @param userDO
     */
    void insertUser(UserDO userDO);

    /**
     * 插入用户表
     * @param userInfoDO
     */
    void insertUserInfo(UserInfoDO userInfoDO);
}
