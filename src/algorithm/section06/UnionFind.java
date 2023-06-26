package algorithm.section06;

import java.util.Scanner;

// 유니온 파인드
// 유니온과 파인드를 이해하는 것이 중요
// 항상 대표노드끼리 연결해준다 
// 파인드는 자신이 속한 집합의 대표노드를 찾는 연산, 그래프를 정돈하고 시간복잡도를 향상해줌 
// 경로압축 
// 공부많이하기 로직에 많이 쓰임

class UnionFind {
	static int parent[];
	public static void main(String[] args) throws Exception {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			int parent[] = new int[n+1];
			
			//대표노드 초기화
			for(int i=0; i<n+1; i++) {
				parent[i] = i;
			}
			//질의계산하는부분
			for(int i=0; i<m; i++) {
				int question = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();
				//유니온
				if(question == 0) {
					union(a, b);
				//두원소같은지보기	
				} else {
					boolean result = checkSame(a,b);
					if(result) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				}
			}
		}

	private static boolean checkSame(int a, int b) {
		a = find(a);
		b = find(b);
		if(a==b) {
			return true;
		}
		return false;
	}

	private static void union(int a, int b) {
		//대표노드를 찾아서 연결하기
		a = find(a);
		b = find(b);
		if(a!=b) {
			//두개연결
			parent[b] = a;
		}
	}

	private static int find(int a) {
		if(a==parent[a]) return a;
		else {
			// value를 index로 바꿔서 찾아보기
			return find(parent[a]);
		}
	}
}