package com.soflite.entity.user.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author Ghai-th
 * @date 2023-07-30 下午 4:36
 */

@Data
public class UserVo {
    
    private String id;
    
    private String account;
    
    private String realName;

    /**
     * 创建人
     */
    
    private String createTime;
    
    /**
     * 更新人
     */
    
    private String updateTime;
    

}
