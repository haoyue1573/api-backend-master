package com.api.project.common;

// https://space.bilibili.com/12890453/

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 *
 * @author
 * @from
 */
@Data
public class IdRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}