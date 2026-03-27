package service;

import model.Bus;
import model.EnergyType;
import model.Tractor;
import model.Vehicle;

public class MainService {

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

	}

}
