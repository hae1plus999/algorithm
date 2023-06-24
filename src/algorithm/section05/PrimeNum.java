package algorithm.section05;

import java.util.Scanner;

// 소수 구하기
// 에라토스테네스체
// 중요

public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n+1];
		
		for(int i=0; i<n; i++) {
			a[i] = i;
		}
		
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(a[i]==0) continue;
			
			for(int j=i+i; j<=n; j=j+1) {
				a[j] = 0;
			}
		}
		//소수 출력
		for(int i=m; i<=n; i++) {
			if(a[i] != 0) {
				System.out.println(a[i]);
			}
		}
	}
}

//오일러의 피
//범위내에서 서로소인 자연수 갯수
//유클리드호제법
//두수의 최대공약수를 구하는 알고리즘