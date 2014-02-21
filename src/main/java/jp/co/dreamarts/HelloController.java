package jp.co.dreamarts;

import jp.co.dreamarts.platform.wx.WeixinMessage;
import jp.co.dreamarts.platform.wx.WeixinUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
@RequestMapping("/restful/weixin.do")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String doGet(HttpServletRequest request) {
        String echostr = request.getParameter("echostr");
        request.setAttribute("echostr", echostr);
        return "hello";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doPost(HttpServletRequest request) throws IOException {
        WeixinMessage wxMsg = null;
        try {
            wxMsg = WeixinUtils.parseXML(request.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(wxMsg.getContent());

        request.setAttribute("wxMsg", wxMsg.getReply());
        return "weixin";
    }


}