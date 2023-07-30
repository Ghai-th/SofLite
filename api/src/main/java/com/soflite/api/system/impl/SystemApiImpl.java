package com.soflite.api.system.impl;

import com.soflite.api.system.SystemApi;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ghai-th
 * @date 2023-07-30 下午 4:49
 */
@CrossOrigin
@RestController
public class SystemApiImpl implements SystemApi {
    
    @Override
    public String rootPath() {
        return "系统服务启动成功";
    }
    
    @Override
    public String getStatus() {
        return "active";
    }
}
