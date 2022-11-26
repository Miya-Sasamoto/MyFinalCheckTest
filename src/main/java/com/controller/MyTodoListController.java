package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyTodoListController {

	@GetMapping("/todolist")
	public String getMyTodoList() {
		return "/index";
	}
}
