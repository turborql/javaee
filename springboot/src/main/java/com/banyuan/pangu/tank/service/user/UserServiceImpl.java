package com.banyuan.pangu.tank.service.user;

import com.banyuan.pangu.tank.common.ResponseVO;
import com.banyuan.pangu.tank.domain.UserDO;
import com.banyuan.pangu.tank.domain.UserDTO;
import com.banyuan.pangu.tank.domain.UserInfoDO;
import com.banyuan.pangu.tank.domain.query.QueryUserListDTO;
import com.banyuan.pangu.tank.domain.query.RegisterDTO;
import com.banyuan.pangu.tank.mapper.user.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public ResponseVO queryUserInfoById(Long userId) {
        UserDO userDO = userMapper.queryUserInfoById(userId);
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(userDO, userDTO);
        return ResponseVO.build(userDTO);
    }

    /**
     * 查询用户列表
     * @return
     */
    public ResponseVO queryUserList(QueryUserListDTO queryUserListDTO) {
        PageHelper.startPage(queryUserListDTO.getPageNum(), queryUserListDTO.getPageSize());
        List<UserDO> userDOList = userMapper.queryUserList();
        PageInfo<UserDO> userDOPageInfo = new PageInfo<>(userDOList);
        return ResponseVO.build(userDOPageInfo);
    }

    /**
     * 注册
     * @param registerDTO
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public ResponseVO register(RegisterDTO registerDTO) {

        UserDO userDO = new UserDO();
        userDO.setUserName(registerDTO.getUserName());
        userDO.setPhone(registerDTO.getPhone());
        userDO.setPassword(registerDTO.getPassword());
        userMapper.insertUser(userDO);

        UserInfoDO userInfoDO = new UserInfoDO();
        userInfoDO.setUserId(userDO.getId());
        userInfoDO.setSex(registerDTO.getSex());
        userInfoDO.setAge(registerDTO.getAge());
        userInfoDO.setNickName(registerDTO.getNickName());
        userInfoDO.setHeadImg(registerDTO.getHeadImg());
        userMapper.insertUserInfo(userInfoDO);

        return ResponseVO.build();

    }
}
