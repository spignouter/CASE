class Hellp {
		void showmenu (){
		System.out.println("�������:");
			System.out.println(" 1. if");
			System.out.println(" 2. switch");
			System.out.println(" 3. for");
			System.out.println(" 4. while");
			System.out.println(" 5. do-while");
			System.out.println(" 6. break");
			System.out.println(" 7. continue \n");
			System.out.println("�������� (q - �����): ");
			}
	
	boolean isvalud (int ch){		
		 if (ch < '1' | ch > '7' & ch != 'q') return false;
		 else return true;
	}
		
		void helpon (int what){
		switch(what){
			case '1':
			System.out.println("�������� if:\n");
			System.out.println("if (�������) ��������;");
			System.out.println("else ��������;");
			break;
			case '2':
			System.out.println("�������� switch:\n");
			System.out.println("switch(���������) {");
			System.out.println(" case ���������:");
			System.out.println(" ������������������ ����������");
			System.out.println(" break;");
			System.out.println(" // ...");
			System.out.println("}");
			break;
			case '3':
			System.out.println(" �������� for: \n ");
			System.out.println(" for (�������������; �������; ��������) ");
			System.out.println(" ��������; ");
			break;
			case '4':
			System.out.println(" �������� while: \n ");
			System.out.println(" while(�������) ��������; ");
			break;
			case '5':
			System.out.println(" �������� do-while: \n ");
			System.out.println(" do { ");
			System.out.println(" ��������; ");
			System.out.println(" } while (�������); ");
			break;
			case '6':
			System.out.println(" �������� break: \n ");
			System.out.println(" break; ��� break �����; \n ");
			break;
			case '7':
			System.out.println(" �������� continue: \n ");
			System.out.println(" continue; ��� continue �����; \n ");
			break;
			//default:
			//System.out.println("������ �� ������.");
		}
			System.out.println();
	}
}

class HelpClassDemo {
	public static void main (String [] args)
		throws java.io.IOException {
			char choice, ignore;
			Hellp hlpobj = new Hellp();
			
			for (;;) {
				do {
					hlpobj.showmenu();
					choice = (char) System.in.read();
					do {
						ignore = (char) System.in.read();
					}while (ignore !='\n');
				}while (!hlpobj.isvalud(choice));
				if (choice == 'q') break;
				System.out.println("\n");
				hlpobj.helpon(choice);
			}
	}
}

