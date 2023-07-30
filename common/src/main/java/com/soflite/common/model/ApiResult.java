package com.soflite.common.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuxs
 * @date 2022-09-19 15:06
 */
@ApiModel("返回结果")
@Data
public class ApiResult<T> {
    
    @ApiModelProperty("状态码:0-成功;500-失败")
    private int code;
    @ApiModelProperty("描述")
    private String msg;
    @ApiModelProperty("数据")
    private T value;
    
    /**
     * 状态类型
     */
    public enum Type {
        /**
         * 成功
         */
        SUCCESS(0),
        /**
         * 警告
         */
        WARN(301),
        /**
         * 错误
         */
        ERROR(500),
        ;
        private final int value;
        
        Type(int value) {
            this.value = value;
        }
        
        public int value() {
            return this.value;
        }
    }
    
    /**
     * 初始化一个新创建的 ApiResult 对象，使其表示一个空消息。
     */
    public ApiResult() {
    }
    
    /**
     * 初始化一个新创建的 ApiResult 对象
     *
     * @param type 状态类型
     * @param msg  返回内容
     */
    public ApiResult(Type type, String msg) {
        this.code = type.value;
        this.msg = msg;
    }
    
    /**
     * 初始化一个新创建的 ApiResult 对象
     *
     * @param type 状态类型
     * @param msg  返回内容
     * @param data 数据对象
     */
    public ApiResult(Type type, String msg, T data) {
        this.code = type.value;
        this.msg = msg;
        if (data != null) {
            this.value = data;
        }
    }
    
    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static <T> ApiResult<T> success() {
        return ApiResult.success("操作成功");
    }
    
    /**
     * 返回成功数据
     *
     * @return 成功消息
     */
    public static <T> ApiResult<T> success(T data) {
        return ApiResult.success("操作成功", data);
    }
    
    /**
     * 返回成功消息
     *
     * @param msg 返回内容
     * @return 成功消息
     */
    public static <T> ApiResult<T> success(String msg) {
        return ApiResult.success(msg, null);
    }
    
    /**
     * 返回成功消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 成功消息
     */
    public static <T> ApiResult<T> success(String msg, T data) {
        return new ApiResult<T>(Type.SUCCESS, msg, data);
    }
    
    /**
     * 返回警告消息
     *
     * @param msg 返回内容
     * @return 警告消息
     */
    public static <T> ApiResult<T> warn(String msg) {
        return ApiResult.warn(msg, null);
    }
    
    /**
     * 返回警告消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 警告消息
     */
    public static <T> ApiResult<T> warn(String msg, T data) {
        return new ApiResult<T>(Type.WARN, msg, data);
    }
    
    /**
     * 返回错误消息
     *
     * @return
     */
    public static <T> ApiResult<T> error() {
        return ApiResult.error("操作失败");
    }
    
    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @return 警告消息
     */
    public static <T> ApiResult<T> error(String msg) {
        return ApiResult.error(msg, null);
    }
    
    /**
     * 返回错误消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 警告消息
     */
    public static <T> ApiResult<T> error(String msg, T data) {
        return new ApiResult<T>(Type.ERROR, msg, data);
    }
    
}
