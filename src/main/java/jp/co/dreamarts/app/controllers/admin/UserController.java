package jp.co.dreamarts.app.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Antony on 14-3-11.
 */

@Controller
@RequestMapping("/admin/user/")
public class UserController {

    @RequestMapping("list.do")
    public String doGet(ModelMap model) {

        System.out.println("admin user list");
        return "admin/user/user_list";
    }
}
