package com.bdth.rure.base.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/9/30.
 */
@Controller
public class IndexController {

    @RequestMapping("main")
    @RequiresPermissions("mains:query")
    public String main(){
        return "main";
    }

    @RequestMapping("index")
    @RequiresPermissions("index:query")
    public String index(){
        return "index";
    }
}
