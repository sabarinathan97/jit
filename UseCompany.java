package Coll1;

import java.util.*;

public class UseCompany {
	public static void main(String[] args) {
		Company c1 = new Company("sabari",101,"male");
		Company c2 = new Company("abi",102,"female");
		Company c3 = new Company("bala",103,"male");
		Company c4 = new Company("sara",104,"female");
		Company c5 = new Company("surya",105,"male");
		
		ArrayList<Company> c = new ArrayList<>();
		c.add(c1);
		c.add(c2);
		c.add(c3);  
		c.add(c4);
		c.add(c5);
		
		String b = "";
		int max = c.get(0).getName().length();
		for(int i=0; i<c.size() ; i++) {
			if(c.get(i).getName().length() >= max) {
				max = c.get(i).getName().length();
				b= c.get(i).getName();
			}
		}
		System.out.println(b);
		
		/*ArrayList<Company> d = new ArrayList<>();
		for(Company s : c) {
			if(s.getGender().equalsIgnoreCase("female")) {
			    d.add(s);
			}
		}
		d.forEach(q -> {System.out.println(q);});*/	
	}
}
