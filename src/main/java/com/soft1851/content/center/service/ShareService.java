package com.soft1851.content.center.service;

import com.github.pagehelper.PageInfo;
import com.soft1851.content.center.domain.dto.ShareDTO;
import com.soft1851.content.center.domain.entity.Share;

public interface ShareService {
    /**
     * 获得分享详情
     *
     * @return ShareDTO
     */
    ShareDTO findById(Integer id);

    PageInfo<Share> query(String title, Integer pageNo, Integer pageSize, Integer userId);

    String getHello();
}
