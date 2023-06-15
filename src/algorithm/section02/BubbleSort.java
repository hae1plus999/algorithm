package algorithm.section02;

import java.util.Scanner;

// 버블정렬
// 인접한 데이터크기를 이용해서 정렬, 다른정렬보다 느림
// 시간복잡도 n제곱 

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i =0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		//버블정렬을 구현하는 영역
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j+1] = temp;
				}
			}
		}
		for(int i=0; i<n; i++) {
			System.out.println(a[i]);
		}
 	}
}