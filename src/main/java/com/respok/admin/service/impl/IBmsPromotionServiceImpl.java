package com.respok.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.respok.admin.mapper.BmsPromotionMapper;
import com.respok.admin.model.entity.BmsPromotion;
import com.respok.admin.service.IBmsPromotionService;
import org.springframework.stereotype.Service;

@Service
public class IBmsPromotionServiceImpl extends ServiceImpl<BmsPromotionMapper, BmsPromotion>
        implements IBmsPromotionService {

}
