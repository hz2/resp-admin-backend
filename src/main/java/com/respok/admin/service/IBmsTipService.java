package com.respok.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.respok.admin.model.entity.BmsTip;

public interface IBmsTipService extends IService<BmsTip> {
    BmsTip getRandomTip();
}
