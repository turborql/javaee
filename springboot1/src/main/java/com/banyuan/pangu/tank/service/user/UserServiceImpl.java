package com.banyuan.pangu.tank.service.user;

import com.banyuan.pangu.tank.common.ResponseVO;
import com.banyuan.pangu.tank.domain.UserDO;
import com.banyuan.pangu.tank.domain.UserDTO;
import com.banyuan.pangu.tank.mapper.user.UserMapper;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

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
    public ResponseVO queryUserList() {
        List<UserDO> userDOList = userMapper.queryUserList();
        List<UserDTO> userDTOList = Lists.newArrayList();
        UserDTO userDTO;
        for (UserDO userDO : userDOList) {
            userDTO = new UserDTO();
            BeanUtils.copyProperties(userDO, userDTO);
            userDTOList.add(userDTO);
        }
        return ResponseVO.build(userDTOList);
    }
}
