package list;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz06 {//5조문제 해결 concat함수 이해x
	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		String temp = "";
		
		for(int i=1; i<6; i++) {
			System.out.println("문자열 "+i+" 입력");
			String name = input.next();
			str.add(name);
		}
		for( int i= 0 ; i<str.size(); i++ ) {
			String concatStr=temp.concat(str.get(i));//?
			temp = concatStr;// 문자열 이어주는 함수
			
		}
		System.out.println(temp);
	}

}
