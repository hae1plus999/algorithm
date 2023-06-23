package algorithm.section04;

import java.util.Scanner;

// 최솟값을 만드는 배치 찾기
// 빼는 관점에서 생각하기

class Greedy02 {
	static int answer = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String example = sc.nextLine();
		String[] str = example.split("-");
		for(int i=0; i<str.length; i++) {
			int temp = Sum(str[i]);
			if(i==0)answer = answer + temp;
			else answer = answer -temp;
		}
	}
	private static int Sum(String a) {
		int sum = 0;
		String[] temp = a.split("[+]");
		for(int i=0; i<temp.length; i++) {
			sum = sum + Integer.parseInt(temp[i]);
		}
		return sum;
	}
}