package set;

import java.util.HashSet;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		//if(contains(num) == false 존재하면 true(중복없앰)
		HashSet<Integer> set = new HashSet<>();
		Random r = new Random();
		
		
		for( ;set.size()<6 ; ) {
			int num = r.nextInt(6)+1;
			set.add(num);
		}
		System.out.println(set);
	}

}
