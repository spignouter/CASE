class Vehicle {
	int passenger;
	int fulcap;
	int mpg;
	
	int range(){
		return mpg * fulcap;
	}
}

class RetMeth {
	public static void main (String args []){
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		int range1, range2;
		
		minivan.passenger =7;
		minivan.fulcap = 16;
		minivan.mpg = 21;
		
		sportscar.passenger = 2;
		sportscar.fulcap =14;
		sportscar.mpg = 12;
		
		range1 = minivan.range();
		range2 = sportscar.range();
		
		System.out.println("����-������ ����� ��������� " + minivan.passenger + 
		"�� ��������� " + range1 + " ����");
		System.out.println("���������� ���������� ����� ��������� " + sportscar.passenger + 
		"�� ��������� " + range2 + " ����");
	}
}