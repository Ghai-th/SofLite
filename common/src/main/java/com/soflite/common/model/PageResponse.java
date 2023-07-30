package com.soflite.common.model;

import lombok.Data;

import java.util.List;

/**
 * @author Ghai-th
 * @date 2023/2/19 14:52
 */
@Data
public class PageResponse implements java.io.Serializable {
    Long total;
    
    Long pageIndex;
    
    Long pageSize;
    
    List<Object> data;
    
    public PageResponse(Long total, Long pageIndex, Long pageSize, List data) {
        this.total = total;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.data = data;
    }
}
