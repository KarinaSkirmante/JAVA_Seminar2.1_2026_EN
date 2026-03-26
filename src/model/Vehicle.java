package model;

public class Vehicle {
	//1.variables
	private int id;
	private String title;
	private String vehicleCode;
	private float price;
	private EnergyType eType;
	
	private static int counter = 0;
	//2.getters
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	//3.setters
	public void setId() {
		id = counter;
		counter++;
	}
	//4.both constructors
	//5.toString function

}
