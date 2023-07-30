package com.soflite.entity.user.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;
import lombok.Data;

/**
 * @author Ghai-th
 * @date 2023-07-30 下午 4:36
 */

@Schema
@Data
@TableName(value = "`user`")
public class UserPo {
    @TableId(value = "id", type = IdType.INPUT)
    @Schema(description = "")
    private String id;
    
    @TableField(value = "account")
    @Schema(description = "")
    private String account;
    
    @TableField(value = "real_name")
    @Schema(description = "")
    private String realName;
    
    @TableField(value = "`password`")
    @Schema(description = "")
    private String password;
    
    @TableField(value = "salt_value")
    @Schema(description = "")
    private String saltValue;
    
    /**
     * 1 删除
     */
    @TableField(value = "deleted")
    @Schema(description = "1 删除")
    private String deleted;
    
    /**
     * 创建人
     */
    @TableField(value = "creator")
    @Schema(description = "创建人")
    private String creator;
    
    @TableField(value = "create_time")
    @Schema(description = "")
    private Date createTime;
    
    /**
     * 更新人
     */
    @TableField(value = "updater")
    @Schema(description = "更新人")
    private String updater;
    
    @TableField(value = "update_time")
    @Schema(description = "")
    private Date updateTime;
    
    public static final String COL_ID = "id";
    
    public static final String COL_ACCOUNT = "account";
    
    public static final String COL_REAL_NAME = "real_name";
    
    public static final String COL_PASSWORD = "password";
    
    public static final String COL_SALT_VALUE = "salt_value";
    
    public static final String COL_DELETED = "deleted";
    
    public static final String COL_CREATOR = "creator";
    
    public static final String COL_CREATE_TIME = "create_time";
    
    public static final String COL_UPDATER = "updater";
    
    public static final String COL_UPDATE_TIME = "update_time";
}
