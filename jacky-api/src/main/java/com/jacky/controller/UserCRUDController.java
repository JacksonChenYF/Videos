package com.jacky.controller;

import com.jacky.service.crud.UserCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jacky.pojo.Users;
import com.jacky.utils.JSONResult;

@RestController
@RequestMapping("/crud")
public class UserCRUDController {
	
	@Autowired
	private UserCRUDService userCRUDService;
	
	@RequestMapping("/save")
	public JSONResult save() {
		
		Users user = new Users("1001", "test-saveuser-1001",
				"123456", "/path", "慕课网", null, null, null);
		userCRUDService.saveUser(user);
		
		return JSONResult.ok();
	}
	
	@RequestMapping("/update")
	public JSONResult update() {
		
		Users user = new Users("1001", "test-saveuser-1111",
				"77777", "/path000", "慕课网好牛~", null, null, null);
		userCRUDService.updateUser(user);
		
		return JSONResult.ok();
	}
	
	@RequestMapping("/update2")
	public JSONResult update2() {
		
		Users user = new Users("1001", null,
				"9999", "/path000999", "慕课网好牛十分牛~", null, null, null);
		userCRUDService.updateUser(user);
		
		return JSONResult.ok();
	}
	
	@RequestMapping("/delUser")
	public JSONResult delUser() {
		
		userCRUDService.delete();
		
		return JSONResult.ok();
	}
}
