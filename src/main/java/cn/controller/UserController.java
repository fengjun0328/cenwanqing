package cn.controller;

import cn.pojo.User;
import cn.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/index.html")
    public String index(@ModelAttribute User user){
        return "index";
    }
    @RequestMapping(value = "/dolo.html")
    public String index2(){
        return "dolo";
    }
    @RequestMapping(value = "/index.html", method = RequestMethod.POST)
    public String getUsers(User user, Model model){

        if(userService.getUser(user)!=null){

            model.addAttribute("user",user);
            return "redirect:/dolo.html";
        }
        return "index";
    }


}
