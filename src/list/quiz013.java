package list;

import java.util.ArrayList;
import java.util.Random;

public class quiz013 {//4조문제 따라하기
	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Integer> stu1 = new ArrayList<>();//Integer 대문자주의
		ArrayList<Integer> stu2 = new ArrayList<>();
		ArrayList<Integer> stu3 = new ArrayList<>();

		for(int i= 0; i<3; i++) { 
			stu1.add(rand.nextInt(100)+1);
			stu2.add(rand.nextInt(100)+1);
			stu3.add(rand.nextInt(100)+1);
		}
		System.out.println("첫번째 학생 => "+stu1);
		System.out.println("첫번째 학생 => "+stu2);
		System.out.println("첫번째 학생 => "+stu3);

		int k1 = stu1.get(0);int k2 = stu2.get(0); int k3 = stu3.get(0);
		int e1 = stu1.get(0);int e2 = stu2.get(0); int e3 = stu3.get(0);
		int m1 = stu1.get(0);int m2 = stu2.get(0); int m3 = stu3.get(0);

		if(k1>k2 && k2>k3) {
			System.out.println("국어 성적 1등은 첫번째 학생입니다");
		}else if(k2>k1 && k2>k3) {
			System.out.println("국어 성적 1등은 두번째 학생입니다");
		}else {
			System.out.println("국어 성적 1등은 세번째 학생입니다");
		}

		if(e1>e2 && e2>e3) {
			System.out.println("영어 성적 1등은 첫번째 학생입니다");
		}else if(e2>e1 && e2>e3) {
			System.out.println("영어 성적 1등은 두번째 학생입니다");
		}else {
			System.out.println("영어 성적 1등은 세번째 학생입니다");
		}

		if(m1>m2 && m2>m3) {
			System.out.println("수학 성적 1등은 첫번째 학생입니다");
		}else if(m2>m1 && m2>m3) {
			System.out.println("수학 성적 1등은 두번째 학생입니다");
		}else {
			System.out.println("수학 성적 1등은 세번째 학생입니다");
		}
		int s1avg=(k1+e1+m1)/3; int s2avg=(k2+e2+m2)/3; int s3avg=(k3+e3+m3)/3;

		if(s1avg>s2avg && s1avg>s3avg) {
			System.out.println("전체 1등은 첫번째 학생입니다");
		}else if(s2avg>s1avg && s2avg>s3avg) {
			System.out.println("전체 1등은 두번째 학생입니다");
		}else {
			System.out.println("전체 1등은 세번째 학생입니다");
		}
	}

}
