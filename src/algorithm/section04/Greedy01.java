package algorithm.section04;

import java.util.Scanner;

// 그리디 알고리즘
// 현재상태에서 최선의 선택을하면 전체중 최선의선택이라고 가정하는 알고리즘
// 잘 따져보지 않으면 반례가 생김

class Greedy01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++ ) {
			a[i] = sc.nextInt();
		}
		//그리디 알고리즘 -> 최대한 큰 동전 먼저 사용하기
		int count = 0;
		for(int i =n-1; i>=0; i--) {
			if(a[i] <=k) {
				count += (k/a[i]);
				k = k%a[i];
			}
		}
		System.out.println(count);
	}
}