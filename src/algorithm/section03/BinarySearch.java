package algorithm.section03;

import java.util.Arrays;
import java.util.Scanner;

// 이진탐색
//데이터가 정렬된 상태에서 원하는 값을 찾아내는 알고리즘
//nlogn 중앙값 비교를 통한 대상 축소 방식 
//원하는 정수 찾기
//5
//4 1 5 2 3
//5
//1 3 7 9 5
public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int m = sc.nextInt();
		for(int i=0;i<m; i++) {
			boolean find = false;
			int target = sc.nextInt();
			int start = 0;
			int end = a.length -1;
			while(start <= end) {
				int mid_index = (start+end)/2;
				int mid_value = a[mid_index];
				if(mid_value>target) {
					end = mid_index -1;
				}else if(mid_value<target) {
					start = mid_index +1;
				} else {
					find = true;
					break;
				}
			}
			if(find) System.out.println(1);
			else System.out.println(0);
		}
	}
}