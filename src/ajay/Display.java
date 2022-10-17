package ajay;

import java.util.ArrayList;

public class Display {
	
	public static void display() {
		EmployeService employeService=new EmployeService();
		Employe employe=new Employe(0, null, null, null, null);
	     ArrayList<Employe> a=employeService.display1();
	     for (Employe employe2 : a) {
	    	 System.out.println(employe2.getId()+"\t"+employe2.getNmae()+"\t"+employe2.getAdd()+"\t"+employe2.getPassword()+"\t"+employe2.getZip());
			
		}
		
	}

}
