package list;

import java.util.ArrayList;

public class quiz08 {//7조문제 해결
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("사과");
		arr.add("바나나");
		arr.add("딸기");
		arr.add("오렌지");
		
		for(String fruit : arr) {
			System.out.println(fruit);
		}
	}

}
