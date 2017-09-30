package com.bdth.rure.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/9/30.
 */
@Controller
@RequestMapping("index")
public class IndexController {

    @RequestMapping("main")
    public String main(){
        return "main";
    }
}
