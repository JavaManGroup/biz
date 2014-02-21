package jp.co.dreamarts.app;

import jp.co.dreamarts.platform.wx.WeixinMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/index")
public class DemoController {
    @RequestMapping(method = RequestMethod.GET)
    public String doGet(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "hello";
    }



}