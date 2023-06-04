package algorithm.section01;

import java.util.Scanner;

// 연속된 자연수의 합 구하기
class NumSum02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		while(end_index != n) {
			if(sum == n) {
				count++; end_index++; sum = sum + end_index;
			} else if(sum>n) {
				sum = sum - start_index;
				start_index++;
			} else {
				end_index++; sum = sum + end_index;
			}
		}
		System.out.println(count);
	}
}