package algorithm.section02;

import java.util.Scanner;

// 선택 정렬
// 최대나 최소 데이터를 찾아가는 정렬
// n 제곱 
// 내림차순으로 자릿수 정렬

//2143

//4
//3
//2
//1

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int a[] = new int[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			a[i] = Integer.parseInt(str.substring(i, i+1));
		}
		
		// 선택정렬
		for(int i=0; i<str.length(); i++) {
			int max = i;
			for(int j=i+1; j<str.length(); j++) {
				if(a[j]>a[max]) {
					max=j;
				}
			}
			if(a[i]<a[max]) {
				int temp = a[i];
				a[i] = a[max];
				a[max] = temp;
			}
		}
		for(int i=0; i<str.length(); i++) {
			System.out.println(a[i]);
		}
	}
}