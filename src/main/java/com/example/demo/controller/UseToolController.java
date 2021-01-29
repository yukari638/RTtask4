package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.UseTool;
import com.example.demo.repository.UseToolMapper;

@Controller
public class UseToolController {
	
	@Autowired
	UseToolMapper userToolMapper;
	
	@GetMapping(value = "/task4")
	public String displayList(Model model) {
		List<UseTool> useTool = userToolMapper.selectAll();
		model.addAttribute("useTool", useTool);
		return "task4";
	}
}
