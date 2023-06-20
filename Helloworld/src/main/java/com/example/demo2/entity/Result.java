package com.example.demo2.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
public class Result {
   // @ApiModelProperty(value = "是否成功")
    private Boolean success;

    //@ApiModelProperty(value = "返回码")
    private int code;

   // @ApiModelProperty(value = "返回消息")
    private String message;

   // @ApiModelProperty(value = "返回数据")
    private Map<String, Object> data = new HashMap<>();
    private static final int SUCCESS = 200;
    private static final int ERROR = 201;

    private Result() {
    }

    /**
     * 返回成功的提示
     *
     * @return
     */
    public static Result ok() {
        Result Result = new Result();
        Result.setSuccess(true);
        Result.setCode(SUCCESS);
        Result.setMessage("成功");
        return Result;
    }

    /**
     * 返回失败的提示消息
     *
     * @return
     */
    public static Result error() {
        Result Result = new Result();
        Result.setSuccess(false);
        Result.setCode(ERROR);
        Result.setMessage("失败");
        return Result;
    }

    /**
     * 设置返回的状态码
     *
     * @param code
     * @return
     */
    public Result code(int code) {
        this.setCode(code);
        return this;
    }

    /**
     * 构造返回的数据，构造的数据以键值对的形式存储
     *
     * @param key
     * @param value
     * @return
     */
    public Result data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    /**
     * 构造返回的数据，构造的数据以map的形式存储
     *
     * @param map
     * @return
     */
    public Result data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }




}
