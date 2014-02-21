package jp.co.dreamarts;

import jp.co.dreamarts.platform.wx.WeixinMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/restful/weixin.do")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String doGet(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "hello";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doPost(HttpServletRequest request) {
        WeixinMessage wxMsg = (WeixinMessage) request.getAttribute("wxMsg");
        System.out.println(wxMsg);
        request.setAttribute("wxMsg", wxMsg);
        return "weixin";
    }


}