package ajay;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		EmployeService employeService=new EmployeService();
		Employe  employe =new Employe(0, null, null, null, null);


		
		System.out.println("1 for insert\n2 for update\n3for display\n4 for delate");
		Scanner scanner=new Scanner(System.in);
		int i=scanner.nextInt();
		if (i==1) {
			employeService.insert();
			Main.main(args);
			
		}
		else if (i==2) {
			Display.display();
			employeService.update();
			Main.main(args);
			
		}
		else if (i==3) {
			Display.display();
			Main.main(args);
			
		}
		else if (i==4) {
			Display.display();
			employeService.delete();
			Main.main(args);
			
		}
	}

}

