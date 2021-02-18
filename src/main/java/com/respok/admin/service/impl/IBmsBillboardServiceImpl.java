package com.respok.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.respok.admin.mapper.BmsBillboardMapper;
import com.respok.admin.model.entity.BmsBillboard;
import com.respok.admin.service.IBmsBillboardService;
import org.springframework.stereotype.Service;

@Service
public class IBmsBillboardServiceImpl extends ServiceImpl<BmsBillboardMapper, BmsBillboard>
                implements IBmsBillboardService {

}
