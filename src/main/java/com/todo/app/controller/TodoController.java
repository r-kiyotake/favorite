package com.todo.app.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todo.app.entity.Todo;
import com.todo.app.mapper.TodoMapper;

@Controller
public class TodoController {

	@Autowired
	TodoMapper todoMapper;

	@RequestMapping(value="/")
	public String index(Model model) {
		List<Todo> list = todoMapper.selectIncomplete();
		List<Todo> doneList = todoMapper.selectComplete();

		if(list == null || list.isEmpty()){
			model.addAttribute("todos", Collections.emptyList());
			model.addAttribute("errorMessage", "好きなものを登録してください。");
		} else {
			model.addAttribute("todos", list);
		}

		if(doneList == null || doneList.isEmpty()){
			model.addAttribute("doneTodos", Collections.emptyList());
			model.addAttribute("doneErrorMessage","あいえうお。");
		} else {
			model.addAttribute("doneTodos", doneList);
		}

		return "index";
	}

	@RequestMapping(value="/add")
	public String add(Todo todo) {
		todoMapper.add(todo);
		return "redirect:/";
	}

	@RequestMapping(value="/update")
	public String update(Todo todo){
		todoMapper.update(todo);
		return "redirect:/";
	}

	@RequestMapping(value="/delete")
	public String delete(Todo todo) {
		todoMapper.delete(todo);
		return "redirect:/";
	}

	@RequestMapping(value="/register")
	public String register() {
		return "register";
	}

	@RequestMapping(value="/delete/{id}")
	public String delete(@PathVariable("id") Long id, Model model) {
		Todo todo = todoMapper.findById(id);
		model.addAttribute("todo", todo);
		return "delete";
	}

	@RequestMapping(value="/detail/{id}")
	public String detail(@PathVariable("id") Long id, Model model) {
		Todo todo = todoMapper.findById(id);
		model.addAttribute("todo", todo);
		return "detail";
	}

}