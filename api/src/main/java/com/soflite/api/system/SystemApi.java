package com.soflite.api.system;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ghai-th
 * @date 2023-07-30 下午 4:49
 */
@Api(tags = "系统接口")
@RequestMapping("/")
public interface SystemApi {
    
    @ApiOperation(value = "服务探活")
    @GetMapping("active")
    String getStatus();
    
    @ApiOperation(value = "服务根路径")
    @GetMapping("/")
    String rootPath();
    

}
