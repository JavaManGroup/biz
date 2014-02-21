package jp.co.dreamarts.app.controllers;

import jp.co.dreamarts.platform.wx.WeixinMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/index.do")
public class DemoController {
    @RequestMapping(method = RequestMethod.GET)
    public String doGet(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        System.out.println("index");
        return "index";
    }

}