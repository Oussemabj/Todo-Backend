package com.oussema.rest.webservices.Restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins="http://localhost:4200")
@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos=new ArrayList<>();
	private static long idCounter=0;
	

	public List<Todo>findAll(){
		return todos;
	}
	public Todo save(Todo todo) {
		if(todo.getId()==-1 || todo.getId()==0) {
			todo.setId(++idCounter);
			todos.add(todo);
		}else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	public Todo deleteById(long id) {
		 Todo todo =findById(id);
		 
		 if (todo==null )return null;
		 
		if( todos.remove(todo)) {
			return todo;
		}
		return null;
	}
	public Todo findById(long id) {
		for(Todo todo:todos) {
			if(todo.getId()==id) {
				return todo;
				
			}
		}
		return    null;
	}
	
	
	
}
