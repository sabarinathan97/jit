package Coll1;

public class Employee {
		private int id;
		private String name;
		private int salary;
		private String role;
		
		public void setId(int id) {
			this.id = id;
		}
		public int getId() {
			return id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public int getSalary() {
			return salary;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getRole() {
			return role;
		}
		public Employee(int id,String name,int salary,String role) {
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.role = role;
		}
		public String toString() {
			return name+" "+id+" "+role+" "+salary;
		}
}
