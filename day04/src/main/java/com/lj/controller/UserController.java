package com.lj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lj.bean.User;
import com.lj.service.UserService;

@Controller
public class UserController {
@Autowired
private UserService us;

@RequestMapping("list")
public String getlist(Model model){
	List<User> list = us.getlist();
	model.addAttribute("list",list);
	return "list";
}
}
