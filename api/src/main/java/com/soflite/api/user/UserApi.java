package com.soflite.api.user;

import com.soflite.common.contant.ApiConstant;
import com.soflite.common.model.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ghai-th
 * @date 2023-07-30 下午 5:30
 */
@Api(tags = "用户接口")
@RequestMapping(ApiConstant.API_USER_PREFIX + "/user")
public interface UserApi {
    
    @GetMapping("list")
    @ApiOperation(value = "获取所有用户列表")
    ApiResult getAllUserList();
}
