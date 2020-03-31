class Vehicle {
	int passenger;
	int fulcap;
	int mpg;
	
	Vehicle(int p, int f, int m) {
		passenger = p;
		fulcap = f;
		mpg = m;
	}
	
	int range(){
		return mpg * fulcap;
	}
	
	double fuelneeded (int mils){
		return (double) mils / mpg;
	}
}

class VehConsDemo {
	public static void main (String args []){
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,13);
		
		double gallons;
		int dist = 252;
		
		gallons = minivan.fuelneeded(dist);
		
		System.out.println("ƒл€ преодалени€" + dist + 
		" миль мини-фургону требуетс€" + gallons + " галлонов топлива");
		
		gallons = sportscar.fuelneeded(dist);
		
		System.out.println("ƒл€ преодалени€" + dist + 
		" миль спртивному автомобилю требуетс€" + gallons + " галлонов топлива");
	}
}