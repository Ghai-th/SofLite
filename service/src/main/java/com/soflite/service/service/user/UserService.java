package com.soflite.service.service.user;

import cn.hutool.core.bean.BeanUtil;
import com.soflite.entity.user.dto.UserDto;
import com.soflite.entity.user.po.UserPo;
import com.soflite.service.dao.user.UserDao;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Ghai-th
 * @date 2023-07-30 下午 5:25
 */
@Service
public class UserService {
    
    UserDao userDao;
    
    public List<UserDto> selectAll() {
        
        List<UserPo> userPos = Optional.ofNullable(userDao.selectAll()).orElse(new ArrayList<>());
        
        if (userPos.isEmpty()) {
            return new ArrayList<>();
        }
        
        List<UserDto> collect = userPos.stream().map(po -> BeanUtil.copyProperties(po, UserDto.class)).collect(Collectors.toList());
        
        return collect;
    }
    
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }
}
