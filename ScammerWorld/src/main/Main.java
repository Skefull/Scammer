package main;

import java.util.ArrayList;
import java.util.Collections;

import person.Victim;

public class Main {

	public static void main(String[] args) {
		ArrayList<Victim> v = new ArrayList<Victim>();
		v.add(new Victim("Terry", 50.08));
		v.add(new Victim("John", 5_000.84));
		v.add(new Victim("Timothy", 6_200_000.06));
		v.add(new Victim("Cherry", 70_000.01));
		v.add(new Victim("Jimmy", 8_321.33));
		v.add(new Victim("Donald", 9_388_902.94));
		
		Collections.sort(v);
		
		for (int i = 0; i < v.size(); i++) {
			Victim temp = v.get(i);
			System.out.println(temp.getName() + ": $" + temp.getAmountScammed());
		}

	}

}
