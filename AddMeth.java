class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;
	
	void range() {
		System.out.println("��������� - " + fuelcap * mpg+ " ����.");
	}
}
class AddMeth {
	public static void main (String [] args){
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		int range1, range2;
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 21;
	
		System.out.println("����-������ ����� ��������� " + minivan.passengers + " ���������� ");
		minivan.range();
		System.out.println("����-������ ����� ��������� " + sportscar.passengers + " ���������� ");
		sportscar.range();
	}
}