package cn.controller;

import cn.pojo.Department;
import cn.pojo.Position;
import cn.pojo.User;
import cn.service.DepartmentService;
import cn.service.PositionService;
import cn.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    private UserService userService;
    @Resource
    private PositionService positionService;
    @Resource
    private DepartmentService departmentService;



    @RequestMapping(value = "/index.html")
    public String index(@ModelAttribute User user){
        return "index";
    }

    /*@RequestMapping(value = "/dolo.html")
    public String dolo(){
        return "dolo";
    }*/

    @RequestMapping(value = "/index.html", method = RequestMethod.POST)
    public String getUsers(User user, Model model){

        if(userService.getUser(user)!=null){

            model.addAttribute("user",user);
            return "redirect:/dolo.html";
        }
        return "index";
    }

    @RequestMapping(value = "/dolo.html")
    public String getUsers2(User user, Model model,
                            @RequestParam(value = "0", required = false) Integer bmId,
                            @RequestParam(value = "0", required = false) Integer gwId){
        //User userListist=userService.getUser(user);
        List<User> userListist=userService.getUser2(user);
        List<Department> departmentList = departmentService.getDepartment();
        List<Position> positionList=positionService.getPosition();
        model.addAttribute("userlist", userListist);
        model.addAttribute("departmentList", departmentList);
        model.addAttribute("positionList", positionList);
        return "dolo";
    }



}
