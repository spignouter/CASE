class Guss4 {
	public static void main (String [] args) 
		throws java.io.IOException{
			char ch, ignore, answer = 'S';
			do {
				System.out.println("�������� ����� �� ��������� A-Z.");
				System.out.print("����������� �� �������: ");
				ch = (char) System.in.read();
				do {
					ignore = (char) System.in.read();
				} while (ignore != '\n');
				if (ch == answer) System.out.println("**���������!**");
				else {
					System.out.print("...��������, ������ ����� ��������� ");
					if (ch < answer) 
					System.out.println("����� � ����� ��������");
						else System.out.println("����� � ������ ��������");
						System.out.println("��������� �������!\n");
				}
			} while(answer !=ch);
		
	}
}