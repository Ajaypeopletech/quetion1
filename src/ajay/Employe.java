package ajay;

public class Employe {
	int id;
	String nmae;
String add;
String zip;
String password;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNmae() {
	return nmae;
}

public void setNmae(String nmae) {
	this.nmae = nmae;
}

public String getAdd() {
	return add;
}

public void setAdd(String add) {
	this.add = add;
}

public String getZip() {
	return zip;
}

public void setZip(String zip) {
	this.zip = zip;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Employe(int id, String nmae, String add, String zip, String password) {
	super();
	this.id = id;
	this.nmae = nmae;
	this.add = add;
	this.zip = zip;
	this.password = password;
}


	
	
}
