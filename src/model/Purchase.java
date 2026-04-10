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
	public void setUserCardNo(String inputUserCardNo) {
		if(inputUserCardNo != null && !inputUserCardNo.isEmpty()
				&& inputUserCardNo.matches("[A-Z]{2}[0-9]{5}")) {
			userCardNo = inputUserCardNo;
		}
		else
		{
			userCardNo = "AB12345";
		}
	}
	
	public void setShoppingList(ArrayList<Vehicle> inputShoppingList) {
		if(inputShoppingList != null 
				&& !inputShoppingList.isEmpty()) {
			shoppingList = inputShoppingList;
		}
		else
		{
			shoppingList = new ArrayList<Vehicle>();
		}
	}
	//no set function of the 
	//datetime because the datetime will be stored automatically
	
	
	//4.both constructors
	public Purchase() {
		setUserCardNo("AB12345");
		//we don't need to call set function for shoppingList
		//because it is initialized in variable declaration
		//we don't need to call set function for datetime
		//because it is initialized in variable declaration
	}
	public Purchase(String inputUserCardNo) {
		setUserCardNo(inputUserCardNo);
		//we don't need to call set function for shoppingList
		//because it is initialized in variable declaration
		//we don't need to call set function for datetime
		//because it is initialized in variable declaration
	}
		
	
	//5.toString
	//AB12345: bus1, bus2, tractor1 [10/14/26T14:26.2465741]
	public String toString() {
		String result = userCardNo + ": " + shoppingList + 
				"[" + datetime + "]";
		return result;
	}
}
