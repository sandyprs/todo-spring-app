package com.ssdimenssion.springwebservice.components;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssdimenssion.springwebservice.beans.ToDoBean;
import com.ssdimenssion.springwebservice.services.ToDoServices;


@RestController
@CrossOrigin(origins = "https://todo-react-webapp.herokuapp.com:443/")
public class ToDoController {
	
	@Autowired
	private ToDoServices toDoServices;
	
	@GetMapping(path="/users/{user}/todos")
	public List<ToDoBean> getAllToDos(@PathVariable String user) {
		
		List<ToDoBean> allTodos = toDoServices.getAllToDos(user);
		
		return allTodos;
		
	}
	
	@DeleteMapping(path="/users/{user}/todos/{id}")
	public List<ToDoBean> deleteToDos(@PathVariable String user,@PathVariable int id) {
		
		List<ToDoBean> allTodos = toDoServices.deleteToDo(id);
		
		return allTodos;
		
	}
	
	@GetMapping(path="/users/{user}/todos/{id}")
	public ToDoBean getToDo(@PathVariable String user,@PathVariable int id) {
		
		ToDoBean todo = toDoServices.findbyId(id);
		
		return todo;
		
	}
	
	@PutMapping(path="/users/{user}/todos/{id}")
	public ToDoBean updateToDo(@PathVariable String user,@PathVariable int id,@RequestBody ToDoBean toDo) {
		
		ToDoBean todo = toDoServices.updateToDo(toDo);
		
		return todo;
		
	}
	
	@PutMapping(path="/users/{user}/todos")
	public ToDoBean insrtToDo(@PathVariable String user,@RequestBody ToDoBean toDo) {
		
		ToDoBean todo = toDoServices.updateToDo(toDo);
		
		return todo;
		
	}
	

}
