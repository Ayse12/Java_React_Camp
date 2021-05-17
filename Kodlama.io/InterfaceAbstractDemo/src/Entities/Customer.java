package Entities;

import java.util.Date;
import java.util.GregorianCalendar;


public class Customer {
	private int Id;
	private String Name;
	private String Surname;
	private Date DateofBirth;
	private String NationaltyId;
	public Customer(int id, String name, String surname, Date dateofBirth, String nationaltyId) {
		super();
		Id = id;
		Name = name;
		Surname = surname;
		DateofBirth = dateofBirth;
		NationaltyId = nationaltyId;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public Date getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public String getNationaltyId() {
		return NationaltyId;
	}
	public void setNationaltyId(String nationaltyId) {
		NationaltyId = nationaltyId;
	}
	
	
	

}
