package algorithm.section06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//위상정렬
//사이클이 없는 방향그래프에서 노드순서를 찾는 알고리즘 
//진입차수 기준으로 돌아간다 
//줄세우기

class TopologicalSort {
	public static void main(String[] args) throws Exception {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			ArrayList<ArrayList<Integer>> a = new ArrayList<>();
			
			for(int i=0; i<=n; i++) {
				a.add(new ArrayList<>());
			}
			int indegree[] = new int[n+1];
			for(int i=0; i<m; i++) {
				int s = sc.nextInt();
				int e = sc.nextInt();
				a.get(s).add(e);
				//진입차수 배열 데이터 저장부분
				indegree[e]++;
			}
			//위상정렬 실행
			Queue<Integer> queue = new LinkedList<>();
			for(int i=1; i<=n; i++) {
				if(indegree[i]==0) {
					queue.offer(i);
				}
			}
			
			while(!queue.isEmpty()) {
				int now = queue.poll();
				System.out.println(now + " ");
				for(int next : a.get(now)) {
					indegree[next]--;
					if(indegree[next]==0) {
						queue.offer(next);
					}
				}
			}
		}
	}

// 다익스트라
// 에지는 모두 양수, 
// 벨만포드
// 음수가중치, 음수사이클 존재 여부 판단 가능, 에지리스트로 구현  

// 플루이드워셜 
// 동적계획법의 원리를 이용해 알고리즘에 접근 

// 최소신장트리
// 모든 노드를 연결할때 사용된 에지들의 가중치의 합 
// 에지 리스트로 그래프를 구현하고 유니온파인드 리스트초기화하기 
