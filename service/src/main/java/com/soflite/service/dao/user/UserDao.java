package com.soflite.service.dao.user;

import com.soflite.entity.user.po.UserPo;
import com.soflite.service.mapper.user.UserMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Ghai-th
 * @date 2023-07-30 下午 5:24
 */
@Component
public class UserDao {
    
    
    UserMapper userMapper;
    
    
    public List<UserPo> selectAll() {
        return userMapper.selectList(null);
    }
    
    
    public UserDao(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
