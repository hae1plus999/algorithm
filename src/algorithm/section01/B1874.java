package algorithm.section01;

import java.util.Scanner;
import java.util.Stack;

//스택과 큐
//스택 
//top 삽입과 삭제가 일어나는 위치
//push top위치에 새로운 데이터 삽입
//pop top위치에 데이터 삭제
//peek top위치에 현재데이터 확인
//재귀함수과 비슷 우선탐색dfs 에 이용, 백트래킹종류에 이용

//큐
//rear 큐에서 끝 데이터
//poll front에서 데이터 삭제
//peek front 위치에 현재데이터 확인
//너비우선탐색bfs 사용 

//스택 구조
class B1874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		int num = 1;
		boolean result = true;
		StringBuffer bf = new StringBuffer();
		
		for(int i=0; i<a.length; i++) {
			int su = a[i];
			if(su>=num) {
				while(su>=num) {
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			} else {
				int no = stack.pop();
				if(no>su) {
					System.out.println("NO");
					result = false;
					break;
				} else {
					bf.append("-\n");
				}
			}
		}
		if(result) System.out.println(bf.toString());
	}
}

//8

//4
//3
//6
//8
//7
//5
//2
//1

//+
//+
//+
//+
//-
//-
//+
//+
//-
//+
//+
//-
//-
//-
//-
//-