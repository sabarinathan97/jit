package Coll1;

import java.util.ArrayList; 

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student("sabari",101,"ece",9182682769l);
		Student s2 = new Student("surya",102,"eee",8110920203l);
		Student s3 = new Student("abi",103,"mech",9186456378l);
		Student s4 = new Student("bala",104,"cse",8765678987l);
		
		ArrayList<Student> s = new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		
		int max = s.get(0).getName().length();
		String b = "";
		int e = 0;
		for(int i = 0; i<s.size(); i++) {
			/*if(s.get(i).getDept().equalsIgnoreCase("ece")) {
			System.out.println(s.get(i));
		}
			else {
				System.out.println("check properly");
			}*/
			if(s.get(i).getName().length() >= max) {
				max = s.get(i).getName().length();
				b = s.get(i).getName();
				i =e;
			}
		}
		System.out.println("Name : "+s.get(e).getName()+", Phone Number : "+s.get(e).getPhoneNum()+", Department : "+s.get(e).getDept());
	}
//}
			
	//	}
	//}
}