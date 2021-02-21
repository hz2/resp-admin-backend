package com.respok.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.respok.admin.model.entity.BmsTip;
import org.springframework.stereotype.Repository;

@Repository
public interface BmsTipMapper extends BaseMapper<BmsTip> {
    BmsTip getRandomTip();
}
