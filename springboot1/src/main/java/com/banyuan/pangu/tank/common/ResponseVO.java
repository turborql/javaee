package com.banyuan.pangu.tank.common;

import lombok.Data;

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
 * @date 2019-11-16 14:08
 * 文件描述:
 *
 */
@Data
public class ResponseVO {

    private Boolean success;

    private String retCode;

    private String retInfo;

    private Object Data;

    /**
     * 正常返回查询成功的信息，默认赋值Success：true
     * 这里一般是一个对象，DTO数据在这里，直接和msg一个层级
     * @return
     */
    public static ResponseVO build() {
        ResponseVO responseVO = new ResponseVO();
        responseVO.setSuccess(Boolean.TRUE);
        responseVO.setRetCode("000000");
        responseVO.setRetInfo("success");
        return responseVO;
    }

    /**
     * 正常返回查询成功的信息，默认赋值Success：true
     * 这里一般是一个对象，DTO数据在这里，直接和msg一个层级
     * @param data
     * @return
     */
    public static ResponseVO build(Object data) {
        ResponseVO responseVO = new ResponseVO();
        responseVO.setSuccess(Boolean.TRUE);
        responseVO.setRetCode("000000");
        responseVO.setRetInfo("success");
        responseVO.setData(data);
        return responseVO;
    }

    /**
     * 一般用于业务逻辑错误时候的返回类型，
     * 前端的报错信息直接用返回的retinfo
     *
     * @param e
     */
    public static ResponseVO build(Exception e) {
        ResponseVO responseVO = new ResponseVO();
        responseVO.setSuccess(Boolean.FALSE);
        responseVO.setRetCode("000001");
        responseVO.setRetInfo(e.getMessage());
        return responseVO;
    }


    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetInfo() {
        return retInfo;
    }

    public void setRetInfo(String retInfo) {
        this.retInfo = retInfo;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }
}
