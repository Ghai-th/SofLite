package com.soflite.common.model;

import lombok.Data;

/**
 * @author Ghai-th
 * @date 2023/2/19 14:51
 */
@Data
public class PageRequest<T> {
    Integer pageSize;
    Integer pageIndex;
    String param;
    
}
