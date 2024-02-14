package list;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz03 {//3조문제, contains 사용안함 해결
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		arr.add(0, "1등급");
		System.out.println(arr);
		
		for(int i= 0; i<3; i++) {
			System.out.println(i+1+"번째 학생 이름 점수");
			arr.add(sc.next());
		}
		System.out.println("최종 출력물 = "+arr);
	}

}
