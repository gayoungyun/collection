package list;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz07 { //5조문제 따라하기
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList num = new ArrayList<>();
		ArrayList name = new ArrayList<>(); //문자와 숫자일때
		String na, nu;
		boolean bool = true;

		while(bool) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			int n = input.nextInt();

			switch (n) {
			case 1: 
				System.out.println("등록할 이름 입력");
				na= input.next();
				if(name.indexOf(na)== -1) {
					name.add(na);
					System.out.println("등록할 번호 입력");
					nu= input.next();
					num.add(nu);
					System.out.println("이름 : "+na);
					System.out.println("번호 : "+nu);
				}else {
					System.out.println("중복된 이름이 있습니다");
				}
				break;

			case 2 :
				System.out.println("확인할 연락처 확인");
				System.out.println("-----이름 목록-----");
				for(int i= 0; i<name.size(); i++) {
					System.out.println(name.get(i));
				}
				na = input.next(); //위치?
				if(name.indexOf(na)== -1) {
					System.out.println("목록에 없습니다");
				}else {
					System.out.println(na+" 연락처는 "+num.get(name.indexOf(na))+"입니다");
				}
				break;

			case 3 :
				System.out.println("-----이름목록-----");
				for(int i = 0; i<name.size();i++) {
					System.out.println(name.get(i));
				}
				System.out.println("삭제할 연락처의 이름 작성");
				na = input.next();

				if(name.indexOf(na)== -1) {
					System.out.println("없는 연락처 입니다");
				}else {
					num.remove(name.indexOf(na));
					name.remove(na);
					System.out.println("-----연락처 목록-----");
					for (int i=0; i<name.size(); i++) {
						System.out.println(name.get(i)+" : \t"+ num.get(i));
					}
				}
				break;

			case 4 :
				System.out.println("-----연락처 목록-----");
				for(int i= 0; i<name.size(); i++) {
					System.out.println(name.get(i)+" : \t"+num.get(i));
				}
				break;

			case 5 :
				bool = false;
				break;

			default:
				System.out.println("다른번호 입력해주세요");
				break;
			}

		}


	}

}
