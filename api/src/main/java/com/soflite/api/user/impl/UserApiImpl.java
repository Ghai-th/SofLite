package com.soflite.api.user.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DateUtil;
import com.soflite.api.system.SystemApi;
import com.soflite.api.user.UserApi;
import com.soflite.common.contant.StringConstant;
import com.soflite.common.model.ApiResult;
import com.soflite.entity.user.dto.UserDto;
import com.soflite.entity.user.vo.UserVo;
import com.soflite.service.service.user.UserService;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Ghai-th
 * @date 2023-07-30 下午 4:49
 */
@CrossOrigin
@RestController
public class UserApiImpl implements UserApi {
    
    UserService userService;
    
    @Override
    public ApiResult getAllUserList() {
        List<UserDto> userDtos = userService.selectAll();
        
        userDtos = Optional.ofNullable(userDtos).orElse(new ArrayList<>());
        List list = new ArrayList();
        for (UserDto userDto : userDtos) {
            
            UserVo userVo = BeanUtil.copyProperties(userDto, UserVo.class);
            
            userVo.setCreateTime(DateUtil.format(userDto.getCreateTime(), StringConstant.DATE_FORMAT));
            userVo.setUpdateTime(DateUtil.format(userDto.getUpdateTime(), StringConstant.DATE_FORMAT));
            list.add(userVo);
        }
        return ApiResult.success(list);
    }
    
    
    public UserApiImpl(UserService userService) {
        this.userService = userService;
    }
}
