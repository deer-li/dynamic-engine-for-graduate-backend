package com.hfuu.graduate.controller;

import com.hfuu.graduate.entity.ComponentByType;
import com.hfuu.graduate.utils.G;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


/**
 * @ author deer-li
 * @ date 2022-12-01 11:14
 */
@Api(value = "交互组件属性",tags = "交互组件属性")
@Slf4j
@RestController
@RequestMapping("/hfuu/componentType")
public class ComponentDealController {

    private ComponentByType componentByType;

    @ResponseBody
    @ApiOperation(value = "获取组件属性表信息",notes = "获取组件属性表信息")
    @GetMapping("/getComponentTypeInfo")
    public String getComponentTypeInfo(){
        return "ok";
    }

    @ApiOperation(value = "添加组件属性信息",notes = "添加组件属性信息")
    @PostMapping("/addComponentTypeInfo")
    public G<ComponentByType> addComponentTypeInfo(){
        /*
        * 遍历组件属性面板回传的对象，并持久化
        * */

        return G.ok(componentByType);
    }

    @ApiOperation(value = "更新组件属性信息",notes = "更新组件属性信息")
    @PostMapping("/updateComponentTypeInfo")
    public String updateComponentTypeInfo(String id){
        /*
        * 根据组件属性的唯一标识id完成组件属性信息的更新工作
        * */
        return "ok";
    }


}
