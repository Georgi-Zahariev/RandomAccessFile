
public class Person {
private int id;
private String name;
private String phone;
private String email;

public Person(){
	this(0,"","","");
}

public Person(int id, String name, String phone, String email) {
	setID(id);
	setName(name);
	setPhone(phone);
	setEmail(email);
}

public int getID() {
	return id;
}

public void setID(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
public String toString(){
	return "Person: id=" + id+ ", name="+ name+ ", phone="+ phone+ ", email=" + email;
}
}
