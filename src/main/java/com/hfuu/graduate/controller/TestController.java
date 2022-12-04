package com.hfuu.graduate.controller;

import com.hfuu.graduate.entity.ComponentByType;
import com.hfuu.graduate.service.test01;
import com.hfuu.graduate.utils.G;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author deer-li
 * @date 2022-11-28 19:48
 */
@Slf4j
@Api(value = "/hfu",tags = "测试接口")
@RestController
@RequestMapping("/hfu")
public class TestController {
    @Resource
    private test01 test01;

    @ResponseBody
    @GetMapping("/test")
    @ApiOperation(value = "获取组件属性表中的所有信息",notes = "获取组件属性表中的所有信息")
    public G<List<ComponentByType>> testMethod(){
        return test01.toStr();
    }

}
