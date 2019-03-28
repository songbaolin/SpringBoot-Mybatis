package com.neo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.neo.bean.User;
import com.neo.service.UserService;

@RestController
@RequestMapping("/springboot")
public class UserController {

	@Autowired
	private UserService userService;
	@RequestMapping("")
    public ModelAndView index() {
        return new ModelAndView("login");
    }
	 @RequestMapping(value = "/login")
	 public String login(User users, HttpServletRequest request, HttpSession session) {
	        ModelAndView mav = new ModelAndView();
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        users.setNick_name(username);
	        users.setPassWord(password);
	        users = this.userService.dologin(users);
	        if (users != null) {
	            session.setAttribute("users", users);
	            mav.setViewName("detail");
	            return "success";
	        } else {
	            session.setAttribute("errormsg", "账号或密码错误!请重新输入");
	            return  "login";
	        }
	        
	    }
	
	@RequestMapping("/getThree")
    public List<User> getThreeForMessage(){
        
        List<User> list = userService.getMessage();        
        return list;
    }
    
    @RequestMapping("/getAll")
    public List<User> getAllMessage(){
        
        List<User> list = userService.getAllMessage();
        int num = list.size();
        if(null!=list && num>3){
            for (int i = 0; i < num-3; i++) {
                list.remove(0);
              
            }
        }
       
        return list;
    }
    @RequestMapping("/getByID")
    public List<User> getMessageById(@RequestParam("id") String id){
        List<User> list = userService.getMessageById(id);
        int num = list.size();
        if(null!=list && num>5){
            for (int i = 0; i < num-5; i++) {
                list.remove(0);
            }
        }
        return list;
    }
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public int addMessage(@RequestBody User appMessage){
        return userService.addMessage(appMessage);
    }
    
    @RequestMapping(value="/delMessageById",method=RequestMethod.GET)
    public int delMessageById(@RequestParam("id") String id){
            return userService.delMessage(id);
    }
}
