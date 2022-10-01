package Coll1;

import java.util.ArrayList;

public class PosNeg {
	public static void main(String[] args) {
			ArrayList<Integer> l = new ArrayList<>();
			l.add(10);
			l.add(-21);
			l.add(30);
			/*for(Integer a : l) {
				if(a>0) {
				System.out.println(a+" is positive number");
			}
				else if (a<0) {
					System.out.println(a+" is negative number");
				}
				else {
					System.out.println(a+" is neutral");
				}
		}*/
			l.forEach((a)-> {
				if(a%2==0) {
					System.out.println(a+" is even number");
				}
				else {
				System.out.println(a+" is odd number");
				}
			}
		);
	}
}
