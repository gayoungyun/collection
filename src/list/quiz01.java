package list;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz01 { //2조문제 따라하기 이해X
	public static void main(String[] args) {
		ArrayList arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String str = null;
		System.out.print("랜덤값의 범위 지정 1~ 입력값 : ");
		int rd = sc.nextInt();
		System.out.print("랜덤값 발생할 회수 지정 : ");
		int count = sc.nextInt();
		
		for(int i = 0; i<count; i++) {
			arr.add((int)(Math.random()*rd+1)); // 사용자가 원하는 범위로 변형할 수 있다
			str= arr.get(i)+""; // 리스트에서 어떤 객체를 가져올때 씀
			if(i == count-1) {
				System.out.println(str.charAt(0));
				break;
			}
			System.out.print(str.charAt(0)+",");
		}
		System.out.println("실제로 출력된 값"+arr);
	}

}
