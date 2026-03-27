package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Purchase {
	//1.variables
	private String userCardNo;
	private ArrayList<Vehicle> shoppingList = new ArrayList<Vehicle>();
	private LocalDateTime datetime = LocalDateTime.now();
	//2.getters
	public String getUserCardNo()
	{
		return userCardNo;
	}
	public ArrayList<Vehicle> getShoppingList(){
		return shoppingList;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	
	//3.setters
	//4.both constructors
	//5.toString
}
