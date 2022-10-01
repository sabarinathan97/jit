package Coll1;

public class Company {
	private String name;
	private int id;
	private String gender;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	
	public Company(String name,int id,String gender) {
		this.name = name;
		this.id = id;
		this.gender = gender;
	}
	public String toString() {
		return name+" "+id+" "+gender;
	}
}
