package com.saraya.model;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class LaptopService {
	private static List<Laptop> laptops= new ArrayList<Laptop>();
	public static int count=6;
	static {
		laptops.add(new Laptop("tidiani",1,"HP","and +","A good engine",450, "#"));
		laptops.add(new Laptop(2,"HP","and +","A good engine",450, "#"));
		laptops.add(new Laptop(3,"Lenovo","and +","A good engine",750, "#"));
		laptops.add(new Laptop(4,"Dell","and +","A good engine",400, "#"));
		laptops.add(new Laptop(5,"Apple","and +","A good engine",630, "#"));
		laptops.add(new Laptop(6,"Lenovo","and +","A good engine",620, "#"));
	}
	public List<Laptop> theTDL= new ArrayList<Laptop>();
	public List<Laptop> retrieveAll(String user) {
//		for(Todo todo:todos) {
//			if(todo.getUsername().equalsIgnoreCase(username)) {
//				theTDL.add(todo);
//			}
//		}
		return laptops;
	}
	
	public void addLaptop(String bench, String model, String description,int price, String picture) {
		
		laptops.add(new Laptop(++count, bench, model, description,price, picture));
	}
	public void deleteLaptop(int id) {
//		ListIterator<Todo> it= todos.listIterator();
//		while(it.hasNext()) {
//			Todo ndiaye = it.next();
//			if(ndiaye.getId()==id) {
//				todos.remove(ndiaye);
//			}
//		
//		}
		Laptop laptop=findById(id);
		laptops.remove(laptop);
		
	}


	public Laptop findById(int id) {
		// TODO Auto-generated method stub
		for(Laptop laptop:laptops) {
			if(laptop.getId()==id) {
				return laptop;
			}
			
		}
		return null;
	}
	public void update(int previous_id,String desc,String picture,int price) {
		Laptop td=findById(previous_id);
		td.setDescription(desc);
		td.setPicture(picture);
		td.setPrice(price);
	}
	}