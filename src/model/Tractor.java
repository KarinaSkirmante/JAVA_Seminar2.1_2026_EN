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
	
	//5. toString
	
	
	//please create two Tractor objects in the MainService
	
	
}
