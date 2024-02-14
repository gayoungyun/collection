package list;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz012 { //2조문제 해결
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		String na;
		int index = 0;
		
		for(int i = 0; i<5 ;i++) {
		System.out.println(i+1+" 번째 이름 입력");
		na = input.next();
		name.add(na);
		}
		System.out.println("김씨성을 가진 사람 : ");
		
		for(int i= 0; i<5; i++) {
			if(name.get(i).charAt(0)== '김') {
				index++; //써야지 몇명인지 출력됨
				System.out.println(name.get(i));
			}
		}
		System.out.println("김씨 성을 가진 분은 모두 "+index+"명 입니다");
		
	}

}
