package Coll1;

import java.util.ArrayList;

public class OddEven {
	public static void main(String[] args) {
		ArrayList<Integer> o = new ArrayList<>();
		o.add(10);
		o.add(21);
		o.add(30);
		for(int i = 0 ; i<o.size() ; i++) {
			if(o.get(i)%2==0) {
				System.out.println(o.get(i)+" is even num");
			}
			else {
				System.out.println(o.get(i)+" id odd num");
			}
		}
	}

}
