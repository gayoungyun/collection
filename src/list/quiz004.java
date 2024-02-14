package list;

import java.util.ArrayList;

public class quiz004 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Black");
		colors.add("White");
		colors.add(0, "Green"); //첫번째로 추가
		colors.add("Red");
		
		colors.set(0, "Blue");// 기존에 추가된 값 변경
		
		System.out.println(colors);
	}

}
