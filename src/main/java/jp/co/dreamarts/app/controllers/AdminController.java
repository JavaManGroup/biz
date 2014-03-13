package jp.co.dreamarts.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Antony on 14-3-11.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping(value = "/index.do", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        System.out.println("index");
        return "admin/index";
    }


}
