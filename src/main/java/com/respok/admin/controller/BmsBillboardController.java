package com.respok.admin.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.respok.admin.common.api.ApiResult;
import com.respok.admin.model.entity.BmsBillboard;
import com.respok.admin.service.IBmsBillboardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/billboard")
public class BmsBillboardController extends BaseController {

    @Resource
    private IBmsBillboardService bmsBillboardService;

    @GetMapping("/show")
    public ApiResult<BmsBillboard> getNotices(){
        List<BmsBillboard> list = bmsBillboardService.list(
            new
                LambdaQueryWrapper<BmsBillboard>().eq(BmsBillboard::isShow,true)
        );
        return ApiResult.success(list.get(list.size()- 1));
    }
}
