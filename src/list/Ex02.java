package list;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		System.out.println("저장 전 size : "+arr.size());
		arr.add("111");
		arr.add("222");
		arr.add("333");
		System.out.println("저장 후 size : "+arr.size()); //3개가 저장
		
		for(int i=0; i<arr.size(); i++) {
			String s = arr.get(i);
			System.out.println(i+"."+s);
		}
		System.out.println("--- for each ---");
		//arr = {"111","222","333"}
		for(String ss : arr ) {
			System.out.println( ss );
		}
		//배열은 length
	}

}
