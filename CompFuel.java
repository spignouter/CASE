class Vehicle {
	int passenger;
	int fulcap;
	int mpg;
	
	int range(){
		return mpg * fulcap;
	}
	
	double fuelneeded (int mils){
		return (double) mils / mpg;
	}
}

class CompFuel {
	public static void main (String args []){
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		double gallons;
		int dist = 252;
		
		minivan.passenger =7;
		minivan.fulcap = 16;
		minivan.mpg = 21;
		
		sportscar.passenger = 2;
		sportscar.fulcap =14;
		sportscar.mpg = 12;
		
		gallons = minivan.fuelneeded(dist);
		
		System.out.println("ƒл€ преодалени€ " + dist + 
		" миль мини-фургону требуетс€ " + gallons + " галлонов топлива");
		
		gallons = sportscar.fuelneeded(dist);
		
		System.out.println("ƒл€ преодалени€ " + dist + 
		" миль спртивному автомобилю требуетс€ " + gallons + " галлонов топлива");
	}
}