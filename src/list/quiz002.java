package list;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz002 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.println(i+1+".번째 성적 등록");
			arr.add(sc.next());
		}
		System.out.println("====성적====");
		System.out.println(arr);
		System.out.println("===========");
		System.out.println("수정할 성적 입력");
		String search = sc.next();
		System.out.println(arr.contains(search));
		System.out.println(arr.indexOf(search));
		System.out.println("-----------------");
		int index = arr.indexOf(search);
		if(index != -1) {
			System.out.println("수정할 성적 입력");
			String change = sc.next();
			System.out.println(arr.get(index)+"=>"+change);
			arr.set(index, change);
			System.out.println("수정 후 성적 : "+arr);
		}else {
			System.out.println(" 성적을 다시 입력하세요 ");
		}
		
		/*for(int i = 0; i<3; i++) {
			System.out.println(i+1+"번째 성적 입력");
			arr.add(sc.next());
		}
		System.out.println("===성적===");
		System.out.println(arr);
		System.out.println("----------");
		System.out.println("수정할 성적 입력");
		String search = sc.next();
		System.out.println(arr.contains(search)); //포함되어있는지 true와 false알려줌
		System.out.println(arr.indexOf(search)); //몇번째 배열인지 알려줌
		System.out.println("------------");
		int index = arr.indexOf(search);
		
		if(index != -1) {
			System.out.println("수정 성적 입력");
			String change = sc.next();
			System.out.println(arr.get(index)+"=>"+change);
			arr.set(index, change);
			System.out.println("수정후 성적 : "+arr);
		}else {
			System.out.println("다시 입력하세요");
		}
		*/
	}

}
