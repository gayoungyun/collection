package list;

import java.util.Scanner;

public class quiz02 {//3조문제 따라하기 해결
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		for(int i=0; i<N ; i++) {
			arr[i]= sc.nextInt();
		}
		int min = arr[0];
		
		for(int i =1 ; i<arr.length; i++) {
			if(arr[i]<min) min=arr[i];
		}
		int max = arr[0];
		
		for(int i= 1; i<arr.length; i++) {
			if(arr[i]>max) max = arr[i];
		}
		System.out.println(min+" "+max);
	}

}
