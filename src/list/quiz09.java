package list;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz09 { //7조문제 따라하기 해결
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		String input;
		
		System.out.println("문자열 입력 : ");
		
		while (true) {
			input = sc.next();
			
			if(input.equals("exit")) {
				break;
			}
			arr.add(input);
		}
		System.out.println("입력된 문자열");
		for(String str :arr ) {
			System.out.println(str);
		}
	}

}
