package Coll1;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e = new Employee(101,"sabari",23000,"manager");
		Employee e1 = new Employee(102,"abi",20000,"eng");
		Employee e2 = new Employee(103,"bala",25000,"developer");
		Employee e3 = new Employee(104,"surya",26000,"asst.dev");
		Employee e4 = new Employee(105,"mohan",27000,"asst");
		ArrayList<Employee> a = new ArrayList<>();
		a.add(e);
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		int max = a.get(0).getName().length();
		int index =0;
		for(int i = 0; i<a.size() ; i++) {
			if(a.get(i).getName().length() > max) {
				max = a.get(i).getName().length();
				index=i;
		}
	}
		System.out.println(a.get(index).getName()+" "+a.get(index).getRole()+" "+ a.get(index).getSalary());
}

}
