package list;

import java.util.Random;

public class quiz04 {//4조문제 따라하기 이해x
	public static void main(String[] args) {
		Random rd = new Random();
		int []lotto = new int[6];

		for(int i = 0 ; i<lotto.length ; i++) {
			int random= (int)(Math.random()*45+1);
			lotto[i]= random;

			for(int j= 0; j<i; j++) {//중복된번호있으면 포문으로 돌아간다
				if(lotto[i]== lotto[j]) {
					i--;
				}
			}
		}
		for(int i= 0; i<lotto.length;i++) {
			System.out.println(lotto[i]+"");
		}
		System.out.println();

		int temp = 0;
		for(int i=0; i<lotto.length;i++) {

			for(int j =0; j<lotto.length;j++) {
				if(lotto[i]<lotto[j]) {//오름차순
					temp = lotto[i];
					lotto[i]= lotto[j];
					lotto[j]= temp;
				}
			}
		}
		for(int i =0; i<lotto.length; i++) {
			System.out.println(lotto[i]+" ");
		}

	}
}