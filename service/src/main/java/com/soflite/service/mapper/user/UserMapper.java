package com.soflite.service.mapper.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soflite.entity.user.po.UserPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Ghai-th
 * @date 2023-07-30 下午 5:23
 */
@Mapper
public interface UserMapper extends BaseMapper<UserPo> {
}
