package list;

public class quiz011 {//5조문제 따라하기 이해X
	public static void main(String[] args) {
		
		int[]num = {1,2,3,4,5,6,7,8,9};
		int[]num3 = new int[3];
		int j, tmp;
		
		for(int i=0; i<num.length; i++) {
			j = (int)(Math.random()*num.length);
			tmp = 0;
			
			tmp = num[i];
			num[i] = num[j];
			num[j] = tmp;
		}
		System.arraycopy(num, 0,num3,0,3); //배열 복사
		
		for(int i=0; i<num3.length;i++) {
			System.out.println(num3[i]);
		}
	}

}
