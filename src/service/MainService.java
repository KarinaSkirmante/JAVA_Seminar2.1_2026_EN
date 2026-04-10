package service;

import java.util.ArrayList;
import java.util.Arrays;

import model.Bus;
import model.EnergyType;
import model.Purchase;
import model.Tractor;
import model.Vehicle;

public class MainService {

	//public is used because this ArrayList will be used in the Purchase class
	public static ArrayList<Vehicle> allVehiclesInStore 
	= new ArrayList<Vehicle>();
	
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		System.out.println(v1);
		Vehicle v2 = new Vehicle("Bicycle", 99.66f, EnergyType.electric);
		System.out.println(v2);
		
		Bus b1 = new Bus();
		System.out.println(b1);
		Bus b2 = new Bus("Ecoline", 10000.99f,EnergyType.diesel,
				70, true);
		System.out.println(b2);
		
		Tractor t1 = new Tractor();
		System.out.println(t1);
		Tractor t2 = new Tractor("Robot Tractor", 12345.65f
				, EnergyType.other, "No any", false);
		System.out.println(t2);
		allVehiclesInStore.addAll(Arrays.asList(b1, b2, t1, t2, b1, b2));
		System.out.println("-------ALL VEHICLES IN THE STORE BEFORE BUYING---------");
		System.out.println(allVehiclesInStore);
		
		Purchase pur1 = new Purchase();
		System.out.println(pur1);
		Purchase pur2 = new Purchase("XX98765");
		pur2.addVehicleToShoppingListByVehicleCode("2_MB bus", 2);
		pur2.addVehicleToShoppingListByVehicleCode("4_BMW tractor", 1);
		System.out.println(pur2);
		
		
		System.out.println("-------ALL VEHICLES IN THE STORE AFTER BUYING---------");
		System.out.println(allVehiclesInStore);

	}

}
