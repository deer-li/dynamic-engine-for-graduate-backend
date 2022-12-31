package com.hfuu.graduate.controller;

import com.hfuu.graduate.entity.ComponentByType;
import com.hfuu.graduate.service.ComponentDealService;
import com.hfuu.graduate.utils.G;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private ComponentDealService componentDealService;

    @ResponseBody
    @ApiOperation(value = "获取组件属性表信息",notes = "获取组件属性表信息")
    @GetMapping("/getComponentTypeInfo")
    public String getComponentTypeInfo(){
        return "ok";
    }

    @ResponseBody
    @PostMapping("/addComponentTypeInfo")
    @ApiOperation(value = "添加组件属性信息",notes = "添加组件属性信息")
    public G<Integer> addComponentTypeInfo(@RequestBody(required = false) ComponentByType componentByType)  {
        System.out.println(componentByType);
        return G.ok(componentDealService.addComponentType(componentByType));
    }

    @ApiOperation(value = "更新组件属性信息",notes = "更新组件属性信息")
    @PostMapping("/updateComponentTypeInfo")
    public String updateComponentTypeInfo(ComponentByType componentByType){
        /*
        * 根据组件属性的唯一标识id完成组件属性信息的更新工作
        * */
        Integer integer = componentDealService.updateComponentTypeById(componentByType);
        /*
        * 实际上，这里返回值类型应该写的抽象泛型封装好的对象
        * */
        return "ok";
    }


}
