package algorithm.section03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 깊이우선탐색
// 그래프 완전탐색
// 시작노드에서 출발하여 분기를 정한후 최대깊이까지 탐색을 마친후 다시 다른쪽분기로 이동
// 스택 자료구조 이용, 재귀함수로 표현 
// 한번 방문한 노드는 다시 방문안함 
// 인접리스트로 표현, 방문배열만들기
//시험에 자주나옴
//연결요소의 갯수구하기
//6 5
//1 2
//2 5
//5 1
//3 4
//4 6

//2
public class DFS {
	static boolean visited[];
	static ArrayList<Integer>[] a;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		visited = new boolean[n+1];
		a = new ArrayList[n+1];
		
		for(int i=1; i<n+1; i++) {
			a[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			a[s].add(e);
			a[e].add(s);
		}
		int count = 0;
		for(int i=1; i<n+1; i++) {
			if(!visited[i]) {
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
	}
	
	// DFS 재귀함수
	private static void DFS(int v) {
		if(visited[v]) {
			return;
		}
		visited[v] = true;
		for(int i : a[v]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
		
	}
}