package Coll1;

public class Student {
	private String name;
	private int id;
	private String dept;
	private long phoneNum;
	
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
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	
	public Student(String name,int id,String dept, long phoneNum) {
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.phoneNum = phoneNum;
	}
	public String toString() {
		return "Name: "+name+", Id: "+id+", Dept: "+dept+", Phone Number: "+phoneNum;
	}
}
