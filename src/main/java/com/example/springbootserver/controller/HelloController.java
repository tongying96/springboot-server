package com.example.springbootserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: TY
 * @Description:
 * @Date created in 2019/3/14
 */
@RestController
public class HelloController {
    @RequestMapping("/index")
    public String hello(){
        return "hello tt";//测试看看
    }
}
