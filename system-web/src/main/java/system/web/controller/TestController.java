package system.web.controller;


import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import system.entity.User;
import system.service.UserService;
import system.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value = "/test")
public class TestController {
	@Inject
	private UserService userService;
	
	@RequestMapping(value = "/lzh", method = RequestMethod.GET)
	@ResponseBody
	public User test(@RequestParam("userId") long userId){
//		User user = new User();
//		user.setUserName(userName);
		User user =  userService.getById(userId);
		//System.out.println(user.getUserName());
		return user;
	}
}
