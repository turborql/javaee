package com.banyuan.pangu.tank.domain.query;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

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
 * @date 2019-11-16 15:33
 * 文件描述:
 *
 */
@Data
public class QueryUserListDTO {

    @NotNull(message = "pageNum不能为空")
    @Min(value = 1, message = "pageNum不能小于1")
    private Integer pageNum;

    @NotNull(message = "pageSize不能为空")
    @Min(value = 1, message = "pageSize不能小于1")
    @Max(value = 100, message = "pageSize不能大于100")
    private Integer pageSize;
}
