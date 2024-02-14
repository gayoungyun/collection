package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class quiz0003 {//3조문제 따라하기 이해x
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("홍길동", "김개똥", "김길동"));
		Scanner sc = new Scanner(System.in);
		
		arr.add(0, "1등급");
		System.out.println(arr);
		
		String name;
		int score;
		for(int cnt= 0; ; cnt++) {
			System.out.println("이름 입력");
			name = sc.next();
			
			if(!arr.contains(name)) { //arr.contains와 반대변수
				System.out.println("잘못된 입력");
				cnt -= 1;//?
				continue;
			}
			System.out.println("점수 입력");
			score = sc.nextInt();
			
			int i = arr.indexOf(name);
			arr.set(i,name+score);
			
			if(cnt ==2)//?
				break;
		}
		System.out.println(arr);
	}

}
