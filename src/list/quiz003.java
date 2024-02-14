package list;

import java.util.ArrayList;
import java.util.Random;

public class quiz003 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		for(int i=1; i<20 ;++i) {
			list.add(i);
		}
		
		Random rd = new Random();
		while (0<list.size()) {
			int index = rd.nextInt(list.size()); //꺼낼 번호 랜덤 선택
			Integer in = (Integer) list.remove(index); // 중복되지 않도록 제거
			System.out.print(in.intValue());
					
			System.out.print(" , ");
		}
	}

}
