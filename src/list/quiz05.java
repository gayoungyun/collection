package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class quiz05 { //5조문제 따라하기 해결
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		Scanner input =  new Scanner(System.in);
		
		for(int i= 1; i<6 ;i++) {
			System.out.println(i+"번째 사람 이름 입력");
			String name = input.nextLine(); //nextLine은 Enter를 치기 전까지 쓴 문자열을 모두 리턴한다는 것
			nameList.add(name);
		}
		System.out.println("김씨 성을 가진 사람들");
		
		for(int i= 0; i<5; i++) {//?
			if(nameList.get(i).charAt(0) == '김') {
				System.out.println(nameList.get(i));
			}
		}
	}

}
