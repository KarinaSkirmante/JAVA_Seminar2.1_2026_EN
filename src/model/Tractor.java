package model;

public class Tractor extends Vehicle{
	//1.variables
	private String additionalTechniques;
	private boolean isOnlyLargeTires;
	
	//2.getters
	public String getAdditionalTechniques() {
		return additionalTechniques;
	}
	
	public boolean getIsOnlyLargeTires()
	{
		return isOnlyLargeTires;
	}
	
	//3.setters
	public void setAdditionalTechniques(String inputAdditionalTechniques)
	{
		if(inputAdditionalTechniques!=null) {
			additionalTechniques = inputAdditionalTechniques;
		}
		else
		{
			additionalTechniques = "No additional techniques";
		}
	}
	
	public void setIsOnlyLargeTires(boolean inputIsOnlyLargeTires) {
		isOnlyLargeTires = inputIsOnlyLargeTires;
	}
	
	//4.both constructors
	public Tractor() {
		super();//this will call Vehicle() no args constructor
		setTitle("BMW tractor");
		setVehicleCode();
		setAdditionalTechniques("AI-driven");
		setIsOnlyLargeTires(true);
		
	}
	
	public Tractor(String inputTitle, float inputPrice,
			EnergyType inputEtype,String inputAdditionalTechniques,
			boolean inputIsOnlyLargeTires) {
		super(inputTitle, inputPrice, inputEtype);
		//^^^ this will call argument constructor from base class -> Vehicle(String inputTitle, float inputPrice, EnergyType inputEtype)
		setAdditionalTechniques(inputAdditionalTechniques);
		setIsOnlyLargeTires(inputIsOnlyLargeTires);
	}
	
	//5. toString
	public String toString() {
		String result = super.toString() 
				+ " " + additionalTechniques + " "
				+ isOnlyLargeTires;
		return result;
	}
	

	
}
