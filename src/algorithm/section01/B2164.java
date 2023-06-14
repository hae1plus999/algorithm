package algorithm.section01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//6

//4

//첫번 카드 버리고 다음카드 밑으로 내리고 반복해서 마지막 하나의 수 구하기
//큐
class B2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			queue.add(i);
		}
		
		while(queue.size()>1) {
			queue.poll();
			int temp = queue.poll();
			queue.add(temp);
		}
		System.out.println(queue.poll());
	}
}