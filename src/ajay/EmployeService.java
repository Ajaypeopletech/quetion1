package ajay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.Scanner;





public class EmployeService implements EmployeDao {

	@Override
	public ArrayList<Employe> display1() {
		ArrayList<Employe> list=new ArrayList<>();
		try {
			Connection connection=DriverManager.getConnection(	"jdbc:mysql://localhost:3306/db", "root", "root");
			Statement statement=connection.createStatement();
			 ResultSet re= statement.executeQuery("SELECT * FROM db.employe;");
			while (re.next()) {
				Employe employe=new Employe(re.getInt(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5));
				
			
		list.add(employe);
			}
		   
			return list;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	
		
	}

	@Override
	public void insert() {
		Scanner scanner=new Scanner(System.in);
		try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        System.out.println("please enter name ");
	        String name=scanner.next();
	        System.out.println("please enter add");
	        String add=scanner.next();
	        System.out.println("pleae enter zip");
	        String zip=scanner.next();
	        System.out.println("please enter password");
	        String password=scanner.next();
	        
	        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
	        Statement statement=connection.createStatement();
	        String query="INSERT INTO `db`.`employe` (`name`, `city`, `zip`, `password`) VALUES ( '"+name+"', '"+add+"', '"+zip+"', '"+password+"')";
	        statement.executeUpdate(query);
		
	      
	    } catch (Exception e) {
	        System.out.println(e);



	   }
	}

	@Override
	public void delete() {
Scanner scanner=new Scanner(System.in);
		
		try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	      
	      
	        System.out.println("pleae enter id");
	        int id=scanner.nextInt();
	       
	        
	        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
	        Statement statement=connection.createStatement();
	        String query="	DELETE FROM `db`.`employe` WHERE (`id` = '"+id+"');";
	        statement.executeUpdate(query);
		
	      
	    } catch (Exception e) {
	        System.out.println(e);



	   }
		
	}

	@Override
	public void update() {
		Scanner scanner=new Scanner(System.in);
		
		try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	      
	      
	        System.out.println("pleae enter id");
	        int id=scanner.nextInt();
	        System.out.println("please enter password");
	        String password=scanner.next();
	        
	        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
	        Statement statement=connection.createStatement();
	        String query="	UPDATE `db`.`employe` SET  `password` = '"+password+"' WHERE (`id` = '"+id+"');";
	        statement.executeUpdate(query);
		
	      
	    } catch (Exception e) {
	        System.out.println(e);



	   }
		
	}


}
