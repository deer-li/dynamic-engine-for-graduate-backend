package com.hfuu.graduate.controller;

import com.hfuu.graduate.service.test01;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @author deer-li
 * @date 2022-11-28 19:48
 */
@Slf4j
@RestController
@RequestMapping("/hfu")
public class TestController {
    @Resource
    private test01 test01;

    @GetMapping("/test")
    public String testMethod(){
        return test01.toStr();
    }
}
