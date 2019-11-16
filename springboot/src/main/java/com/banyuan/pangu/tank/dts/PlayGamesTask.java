package com.banyuan.pangu.tank.dts;

import com.banyuan.pangu.tank.domain.UserDO;
import com.banyuan.pangu.tank.mapper.user.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
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
 * @date 2019-11-16 15:12
 * 文件描述:
 *
 */
@Component
public class PlayGamesTask {

    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserMapper userMapper;

    Long userId = 1L;

    @Scheduled (fixedRate = 5000000)
    public void excute() {
        UserDO userDO = userMapper.queryUserInfoById(userId);
        if (Objects.nonNull(userDO)) {
            logger.error("当前学生的userId= " + userId + ", phone is :" + userDO.getPhone());
        } else {
            logger.error("userId=" + userId + "的学生不存在");
        }
        userId = userId + 1L;
    }

}
