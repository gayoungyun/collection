package list;

import java.util.ArrayList;

public class quiz010 {//7조뮨제 따라하기 해결
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		for(int i= 0; i<10 ; i++) {
			arr.add("고블린"+(i+1));
		}
		System.out.println("생성된 고블린 : "+arr);
		
		for(int i= 0; i<10 ;i++) {
			System.out.println(arr.get(0)+"을 잡았습니다");
			arr.remove(0); //없으면 0위치인 고블린 1만 잡는다
		}
		System.out.println("잡은 후 남은 고블린 : "+arr);
	}

}
