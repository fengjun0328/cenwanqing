package cn.controller;

import cn.pojo.Biz_leave;
import cn.pojo.Department;
import cn.pojo.Position;
import cn.pojo.User;
import cn.service.Biz_leaveService;
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
    @Resource
    private Biz_leaveService biz_leaveService;


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
        List<User> userListist=userService.getUser2(user);
        List<Department> departmentList = departmentService.getDepartment();
        List<Position> positionList=positionService.getPosition();
        model.addAttribute("userlist", userListist);
        model.addAttribute("departmentList", departmentList);
        model.addAttribute("positionList", positionList);
        return "dolo";
    }


    @RequestMapping(value = "/biz.html")
    public String getBiz(Biz_leave biz_leave,User user, Model model,
                         @RequestParam(value = "0", required = false) Integer bmId,
                         @RequestParam(value = "0", required = false) Integer gwId,
                         @RequestParam(value = "0", required = false) Integer xmId){
        List<User> userListist=userService.getUser2(user);
        List<Department> departmentList = departmentService.getDepartment();
        List<Position> positionList=positionService.getPosition();
        List<Biz_leave> bizLeaves=biz_leaveService.getBiz(biz_leave);
        model.addAttribute("userlist", userListist);
        model.addAttribute("departmentList", departmentList);
        model.addAttribute("positionList", positionList);
        model.addAttribute("bizLeaves", bizLeaves);
        return "biz";
    }

    @RequestMapping(value = "/del.html")
    public String delid(User user,Model model,@RequestParam Integer id){
        userService.delid(id);
        return "redirect:/dolo.html";
    }

    @RequestMapping(value = "/delbiz.html")
    public String delid(Biz_leave biz_leave,Model model,@RequestParam Integer id){
        biz_leaveService.delbiz(id);
        return "redirect:/biz.html";
    }

    /* 添加 */
    @RequestMapping("/addNews.html")
    public String addfight(@ModelAttribute("user") User user, Model model) {
        List<Position> position = positionService.getPosition();
        List<Department> departments = departmentService.getDepartment();
        model.addAttribute("departments", departments);
        model.addAttribute("position", position);
        return "useradd";
    }

    @RequestMapping(value = "/useradd.html", method = RequestMethod.POST)
    public String add(User user, Model model) {
        System.out.println(3333333);
        if (userService.addUser(user)) {
            System.out.println("添加成功！！！");
            return "redirect:/dolo.html";
        }
        System.out.println("添加失败！！！");
        return "useradd";
    }

}
