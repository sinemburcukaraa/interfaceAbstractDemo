package entites;

import java.time.LocalDate;

import abstracts.IEntity;


public class Customer implements IEntity{
  private int id;
  private String FirstName;
  private String LastName;
  private String NationalityId;
  private LocalDate dateofbirth;
  
  
  
public Customer(int id, String firstName, String lastName, String nationalityId, LocalDate dateofbirth) {
	super();
	this.id = id;
	FirstName = firstName;
	LastName = lastName;
	NationalityId = nationalityId;
	this.dateofbirth = dateofbirth;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getNationalityId() {
	return NationalityId;
}
public void setNationalityId(String nationalityId) {
	NationalityId = nationalityId;
}
public LocalDate getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(LocalDate dateofbirth) {
	this.dateofbirth = dateofbirth;
}

  


  
}
