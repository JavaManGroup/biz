package jp.co.dreamarts.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Antony on 14-2-21.
 */
@Controller
@RequestMapping("/login.do")
public class LoginController {
    @RequestMapping(method = RequestMethod.GET)
    public String doGet(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        System.out.println("index");
        return "login";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String doPost(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        System.out.println("index");
        return "login";
    }
}
