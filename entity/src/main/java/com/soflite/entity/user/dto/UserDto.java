package com.soflite.entity.user.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author Ghai-th
 * @date 2023-07-30 下午 4:36
 */

@Data
public class UserDto {
    
    private String id;
    
    private String account;
    
    private String realName;
    
    /**
     * 1 删除
     */
    private String deleted;
    
    /**
     * 创建人
     */
    
    private Date createTime;
    
    /**
     * 更新人
     */
    
    private Date updateTime;
    

}
