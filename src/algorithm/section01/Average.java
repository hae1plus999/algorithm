package algorithm.section01;

import java.util.Scanner;

// 총합 * 100/최고점수/과목의수 계산 
class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		long sum = 0;
		long max = 0;
		
		for(int i=0; i<n; i++) {
			if(a[i]>max) max = a[i];
			sum = sum + a[i];
		}
		System.out.println(sum*100.0/max/n);
	}
}