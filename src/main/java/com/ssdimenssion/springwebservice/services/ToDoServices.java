package com.ssdimenssion.springwebservice.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ssdimenssion.springwebservice.beans.ToDoBean;

@Service
public class ToDoServices {
	private static List<ToDoBean> allTodos = new ArrayList<ToDoBean>();
	private static int id = 0;
	
	static {
		allTodos.add(new ToDoBean(++id, "ssdimen", "Spring", 'N', new Date()));
		allTodos.add(new ToDoBean(++id, "ssdimen", "React", 'N', new Date()));
		allTodos.add(new ToDoBean(++id, "ssdimen", "Java", 'Y', new Date()));
		allTodos.add(new ToDoBean(++id, "ssdimen", "Android", 'Y', new Date()));
	}
	
	public List<ToDoBean> getAllToDos(String user){
		
		return allTodos;
		
	}
	
	public List<ToDoBean> deleteToDo(long id){
		ToDoBean toDo = findbyId(id);
		allTodos.remove(toDo);
//		System.out.println(allTodos);
		return allTodos;
		
	}
	
	public ToDoBean updateToDo(ToDoBean updatedToDo){
		
		if(updatedToDo.getId() == -1) {
			updatedToDo.setId(++id);
			allTodos.add(updatedToDo);
		}else {
			deleteToDo(updatedToDo.getId());
			allTodos.add(updatedToDo);
		}
		
		return updatedToDo;
		
	}
	
//	public ToDoBean insertToDo(ToDoBean toDo){
//		int id = allTodos.size();
////		System.out.println(allTodos);
//		allTodos.add(toDo);
//		return toDo;
//		
//	}

	public ToDoBean findbyId(long id) {
		for(ToDoBean todo: allTodos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}

}
