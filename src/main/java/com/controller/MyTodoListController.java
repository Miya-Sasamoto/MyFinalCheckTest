package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.domain.model.MMyTodoList;
import com.repository.MyTodoListMapper;

@Controller
@RequestMapping(value="/")
public class MyTodoListController {

	@Autowired
	MyTodoListMapper myTodoListMapper;
	
	 @GetMapping(value="")
	    public String index(Model model) {
	        List<MMyTodoList> list = myTodoListMapper.selectAll();
	        model.addAttribute("todos",list);
	        return "index";
	    }
	 
	 @PostMapping(value="add")
	 	public String add(MMyTodoList myTodoList) {
		 myTodoListMapper.add(myTodoList);
		 return "redirect:/";
	 }
	 
	 @PostMapping(value="update", params = "update")
	    public String update(MMyTodoList myTodoList) {
		 myTodoListMapper.update(myTodoList);
	        return "redirect:/";
	    }
	 
	 //@DeleteMapping(value="delete/{id:.+}" )
	 @PostMapping(value = "update", params = "delete")
	    public String delete(MMyTodoList myTodoList) {
		 myTodoListMapper.delete(myTodoList);
	        return "redirect:/";
	    }
}
