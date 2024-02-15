package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex003 {
	public static void main(String[] args) {
		HashMap<String ,String> map = new HashMap<>();
		HashMap<String ,Integer> map1 = new HashMap<>();
		Scanner input = new Scanner(System.in);
		int num=0;
		String mon=null;
		String menu=null;

		while(true) {
			System.out.println("1. 메뉴등록");
			System.out.println("2. 메뉴별 가격보기");
			System.out.println("3. 종료");
			System.out.println(">>>");

			/*map.put("1", "메뉴등록");
		map.put("2", "메뉴 가격 보기");
		map.put("3", "종료");

		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator(); // 뒤에 다시사용할때 겹침 해결?

		for( ; it.hasNext() ; ) {
			String key = it.next();
			System.out.println(key+"."+map.get(key));
		}
		System.out.println(">>>");
			 */

			num = input.nextInt();
			if (num ==1) {
				System.out.println("메뉴입력 : ");
				menu =input.next();
				if(map.containsKey(menu) == false) { // 키나 값이 있는지 확인
					System.out.println("가격 입력 : ");
					mon = input.next();
					map.put(menu, mon);
					System.out.println("등록 완료");
				}else {
					System.out.println("메뉴가 있습니다");
				}
			}
			else if(num ==2) { 
				Iterator it = map.keySet().iterator(); //값을 가져오거나 삭제반복시
				while(it.hasNext()) {
					menu= (String)it.next();
					System.out.println(menu+" : "+map.get(menu));
				}
				System.out.println("1.수정 2.삭제 3.나가기");
				System.out.println(">>>");
				int choise = input.nextInt();
				if(choise ==1) {
					System.out.println("변경 이름 입력");
					menu = input.next();
					if(map.containsKey(menu)) {
						System.out.println("수정 가격 입력");
						String newPrice = input.next();
						System.out.println(map.get(menu)+"=>"+newPrice);
						System.out.println("변경완료");
						map.replace(menu, newPrice);
					}else {
						System.out.println("메뉴가 없습니다");
					}
				}
				else if(choise == 2) {
					System.out.println("삭제 이름 입력");
					menu= input.next();
					if(map.containsKey(menu)) {
						map.remove(menu);
						System.out.println("삭제완료");
					}else {
						System.out.println("없는 이름입니다");
					}
				}
			}else 
				break;

		}
	}
}
