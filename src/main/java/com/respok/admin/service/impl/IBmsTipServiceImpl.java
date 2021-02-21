package com.respok.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.respok.admin.mapper.BmsTipMapper;
import com.respok.admin.model.entity.BmsTip;
import com.respok.admin.service.IBmsTipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class IBmsTipServiceImpl extends ServiceImpl<BmsTipMapper, BmsTip> implements IBmsTipService {

    @Override
    public BmsTip getRandomTip() {
        BmsTip todayTip = null;
        try {
            todayTip = this.baseMapper.getRandomTip();
            System.out.println("getRandomTip");
            System.out.println(this.baseMapper.getRandomTip());
        } catch (Exception e) {
            log.error("tip转化失败==>"+  e);
        }
        return todayTip;
    }
}
