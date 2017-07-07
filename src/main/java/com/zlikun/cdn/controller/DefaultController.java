package com.zlikun.cdn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @auther zlikun <zlikun-dev@hotmail.com>
 * @date 2017/7/7 13:47
 */
@Controller
public class DefaultController {

    @RequestMapping(value = "/" ,produces = "text/html; charset=UTF-8")
    public @ResponseBody Object index() {
        return "欢迎访问我的开源CDN镜像工程" ;
    }

}
