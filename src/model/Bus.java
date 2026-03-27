package model;

public class Bus extends Vehicle{
	//1. variables 
	private int numberOfSeats;
	private boolean hasBaggageDivision;
	//2. getters
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public boolean getHasBaggageDivision()
	{
		return hasBaggageDivision;
	}
	
	//3. setters
	public void setNumberOfSeats(int inputNumberOfSeats) {
		if(inputNumberOfSeats > 5 && inputNumberOfSeats < 100) {
			numberOfSeats = inputNumberOfSeats;
		}
		else
		{
			numberOfSeats = 5;
		}
	}
	
	public void setHasBaggageDivision(boolean inputHasBaggageDivision) {
		hasBaggageDivision = inputHasBaggageDivision;
	}
	
	
	
	//4. both constructors
	public Bus() {
		super();//this will call Vehicle() no args constructor
		setTitle("MB bus");//I would like to change default vehicle name to that
		setVehicleCode();//need to call it because the title is changed
		setNumberOfSeats(50);
		setHasBaggageDivision(true);
	}
	
	public Bus(String inputTitle, float inputPrice,
			EnergyType inputEtype, int inputNumberOfSeats,
			boolean inputHasBaggageDivision) {
		super(inputTitle, inputPrice, inputEtype);
		//^^^ this will call argument constructor from base class -> Vehicle(String inputTitle, float inputPrice, EnergyType inputEtype)
		setNumberOfSeats(inputNumberOfSeats);
		setHasBaggageDivision(inputHasBaggageDivision);
		
	}
	
	
	//5. toString
	public String toString() {
		String result = super.toString() + " " 
	+ numberOfSeats + " " + hasBaggageDivision;
		return result;
	}
	 
}
