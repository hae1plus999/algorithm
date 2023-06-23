package algorithm.section06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//그래프
//노드와 에지로 구정된 집합
//유니온파인드 : 그래프의 사이클이 생성되는지 판별하는 알고리즘
//위상정렬 : 사이클이 없고 방향이 있는 그래프, 값이 유일하지 않다 , 전후 관계가 있어야 한다.
//다익스트라, 벨만포드, 플로이드워셜 : 최단거리 알고리즘
//최소신장트리 그래프에서 최소의 가중치 합으로 모든 노드를 연결할 수 있게 해주는 알고리즘, 유니온파인드 포함, 사이클이 없다 

//인접리스트를 이용한 그래프 구현
//이분그래프판별하기
//dfs를 정확하게 아는 것이 중요

class Graph {
	static ArrayList<Integer>[] a;
	static int[] check;
	static boolean[] visited;
	static boolean IsEven;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		//주어진 테스트 케이스 만큼 돌림 
		for(int t=0; t<testCase; t++) {
			String[] s = br.readLine().split(" ");
			int v = Integer.parseInt(s[0]);
			int e = Integer.parseInt(s[1]);
			a = new ArrayList[v+1];
			visited = new boolean[v+1];
			check = new int[v+1];
			IsEven = true;
			
			for(int i=1; i<=v; i++) {
				a[i] = new ArrayList<Integer>();
			}
			//에지 데이터 저장하기
			for(int i=0; i<e; i++) {
				s = br.readLine().split(" ");
				int start = Integer.parseInt(s[0]);
				int end = Integer.parseInt(s[1]);
				a[start].add(end);
				a[end].add(start);
			}
			//모든 노드에서 dfs실행 해야함
			for(int i=1; i<=v; i++) {
				if(IsEven) {
					DFS(i);
				} else {
					break;
				}
			}
			if(IsEven) System.out.println("YES");
			else System.out.println("NO");
		}
	}

	private static void DFS(int start) {
		visited[start] = true;
		//인접리스트로 받아서 start에서 연결된 모든 노드를 탐색하게된다 
		for(int i : a[start]) {
			if(!visited[i]) {
				//바로 직전에 있는 노드와 다른 집합으로 분류를 해주는 것이 필요 
				check[i] = (check[start]+1)%2;
						DFS(i);
			} else if(check[start] == check[i]) {
				IsEven = false;
			}
		}
	}
}