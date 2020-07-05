package work6;

import java.util.Set;
import java.util.TreeSet;

public class Sorting {
	public static void main(String[] args) {
		Set<Integer>num = new TreeSet<Integer>();
		num.add(3);
		num.add(14);
		num.add(63);
		num.add(34);
		for(Integer i : num) {
			System.out.println(i);
		}
	}

}
