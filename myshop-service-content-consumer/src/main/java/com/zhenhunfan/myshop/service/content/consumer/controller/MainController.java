package com.zhenhunfan.myshop.service.content.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>Title: MainController</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2020/9/24
 */
@Controller
public class MainController {

    /**
     * 跳转到首页
     * @return
     */
    @RequestMapping(value = {"main", ""}, method = RequestMethod.GET)
    public String main() {
        return "content/main";
    }

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index() {
        return "content/index";
    }
}
