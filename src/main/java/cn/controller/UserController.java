package cn.controller;

import cn.pojo.*;
import cn.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

import javax.annotation.Resource;
import java.util.Date;
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
    @Resource
    private FinancialService financialService;


    @RequestMapping(value = "/index.html")
    public String index(@ModelAttribute User user){
        return "index";
    }

    /*@RequestMapping(value = "/dolo.html")
    public String dolo(){
        return "dolo";
    }
    @RequestMapping(value = "/err.html")
    public String err(){
        return "err";
    }*/

    /**
     * 登录
     * @param user
     * @param model
     * @return
     */
    @RequestMapping(value = "/index.html", method = RequestMethod.POST)
    public String getUsers(User user, Model model){

        if(userService.getUser(user)!=null){

            model.addAttribute("user",user);
            return "redirect:/dolo.html";
        }
        return "index";
    }

    /**
     * 员工表查询所有
     * @param user
     * @param model
     * @param bmId
     * @param gwId
     * @return
     */
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

    /**
     * 查询单个用户
     * @param id
     * @param
     * @param model
     * @return
     */
    @RequestMapping("/getUser")
    public String getUser(Integer id,Model model){
        model.addAttribute("user", userService.getid(id));
        return "editUser";
    }


    /**
     * 请假表查询所有
     * @param biz_leave
     * @param user
     * @param model
     * @param bmId
     * @param gwId
     * @param xmId
     * @return
     */
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

    /**
     * 员工表删除
     * @param user
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value = "/del.html")
    public String delid(User user,Model model,@RequestParam Integer id){
        userService.delid(id);
        return "redirect:/dolo.html";
    }

    /**
     * 请假表删除
     * @param biz_leave
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value = "/delbiz.html")
    public String delid(Biz_leave biz_leave,Model model,@RequestParam Integer id){
        biz_leaveService.delbiz(id);
        return "redirect:/biz.html";
    }

    /* 员工表添加 */
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

    /* 员工表修改 */
    @RequestMapping("/userupd.html")
    public String updfight(@ModelAttribute("user") User user,
                           Model model, @RequestParam Integer id) {
        User user1=userService.getid(id);
        List<Department> department = departmentService.getDepartment();
        List<Position> position = positionService.getPosition();
        model.addAttribute("department", department);
        model.addAttribute("position", position);
        model.addAttribute("user1", user1);

        return "userupd";
    }

    @RequestMapping(value = "/userupd.html", method = RequestMethod.POST)
    public String updeta(Model model, User user) {

        if (userService.updUser(user)) {
            return "redirect:/dolo.html";
        }
        return "/userupd";
    }

    /* 员工表添加 */
    @RequestMapping("/bizadd.html")
    public String addfight(@ModelAttribute("biz_leave") Biz_leave biz_leave, Model model) {
        List<Position> position = positionService.getPosition();
        List<Department> departments = departmentService.getDepartment();
        model.addAttribute("departments", departments);
        model.addAttribute("position", position);
        return "bizadd";
    }

    @RequestMapping(value = "/bizadd.html", method = RequestMethod.POST)
    public String add(Biz_leave biz_leave, Model model) {
        System.out.println(3333333);
        biz_leave.setStarttime(new Date());
        biz_leave.setEndtime(new Date());
        biz_leave.setPjshijian(new Date());
        if (biz_leaveService.bizadd(biz_leave)) {
            System.out.println("添加成功！！！");
            return "redirect:/biz.html";
        }
        System.out.println("添加失败！！！");
        return "bizadd";
    }

    /**
     * 财务所有信息
     * @param financial
     * @param user
     * @param model
     * @return
     */
    @RequestMapping(value = "/caiwu.html")
    public String getFinancial(Financial financial, User user, Model model){
        List<Financial> financials=financialService.getFinancial(financial);
        model.addAttribute("financials",financials);
        return "caiwu";
    }

    /**
     * 财务Id删除
     * @param financial
     * @param id
     * @return
     */
    @RequestMapping(value = "/delcaiwu.html")
    public String delFinancial(Financial financial,@RequestParam Integer id){
        financialService.delFinancial(id);
        return "redirect:/caiwu.html";
    }

    /* 财务添加 */
    @RequestMapping("/caiwuadd.html")
    public String addfinancial(@ModelAttribute("financial") Financial financial, Model model) {
        return "caiwuadd";
    }

    @RequestMapping(value = "/caiwuadd.html", method = RequestMethod.POST)
    public String add(Financial financial, Model model) {
        System.out.println(3333333);
        financial.setCheck_time(new Date());
        financial.setModify_time(new Date());
        if (financialService.addFinancial(financial)) {
            System.out.println("添加成功！！！");
            return "redirect:/caiwu.html";
        }
        System.out.println("添加失败！！！");
        return "caiwuadd";
    }

}
