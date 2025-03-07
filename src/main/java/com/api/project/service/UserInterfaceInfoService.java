package com.api.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.api.apicommon.model.entity.UserInterfaceInfo;

/**
 * 用户接口信息服务
 *
 * @author
 * @from
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    // [编程导航学习圈](https://t.zsxq.com/0emozsIJh) 连接万名编程爱好者，一起优秀！20000+ 小伙伴交流分享、40+ 大厂嘉宾一对一答疑、4000+ 编程问答参考、100+ 各方向编程交流群

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
