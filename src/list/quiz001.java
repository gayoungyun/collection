package list;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz001 {
	public static void main(String[] args) {
		ArrayList<Character> arr = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("6개의 학점은 빈 칸으로 분리 입력");
		for(int i = 0 ; i<6 ; i++) {
			char grade = sc.next().charAt(0);
			arr.add(Character.valueOf(grade));
		}
		double sum= 0;
		for(int i = 0 ; i<6 ; i++) {
			if(arr.get(i).equals('A')) sum +=4.0;
			else if(arr.get(i).equals('B')) sum +=3.0;
			else if(arr.get(i).equals('C')) sum +=2.0;
			else if(arr.get(i).equals('D')) sum +=1.0;
			else if(arr.get(i).equals('F')) sum +=0.0;
		}
		System.out.println(sum /6);
		
	}

}
