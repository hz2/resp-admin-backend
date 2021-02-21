package com.respok.admin.controller;

import com.respok.admin.common.api.ApiResult;
import com.respok.admin.model.entity.BmsTip;
import com.respok.admin.service.IBmsTipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/tip")
public class BmsTipController extends BaseController {

    
    @Resource
    private IBmsTipService bmsTipService;

    @GetMapping("/today")
    public ApiResult<BmsTip> getRandomTip() {
        BmsTip tip = bmsTipService.getRandomTip();
        // System.out.println("tip "+ String.valueOf(tip) );        
        return ApiResult.success(tip);
    }
}
