package com.api.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.api.apicommon.model.entity.InterfaceInfo;

/**
 * 接口信息服务
 *
 * @author
 * @from
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
