package service;

import model.EnergyType;
import model.Vehicle;

public class MainService {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		System.out.println(v1);
		Vehicle v2 = new Vehicle("Bicycle", 99.66f, EnergyType.electric);
		System.out.println(v2);

	}

}
