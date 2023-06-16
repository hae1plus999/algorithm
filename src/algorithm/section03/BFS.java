package algorithm.section03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//너비우선탐색
//가장 가까운 노드를 먼저 방문하면서 탐색하는 알고리즘 
//목표노드에 도착하는 경로가 여러개일때 최단경로 보장
//큐자료구조이용 
//미로탐색하기
public class BFS {
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static boolean[][] visited;
	static int[][] a;
	static int n,m;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		a = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			st =  new StringTokenizer(br.readLine());
			String line = st.nextToken();
			
			for(int j=0; j<m; j++) {
				a[i][j] = Integer.parseInt(line.substring(j, j+1));
			}
		}
		BFS(0,0);
		System.out.println(a[n-1][m-1]);
	}

	private static void BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {i,j});
		while(!queue.isEmpty()) {
			int now[] = queue.poll();
			visited[i][j] = true;
			//상하좌우로 검색
			for(int k=0; k<4; k++) { 
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				//배열을 넘어가면 안되고
				if(x >= 0 && y>=0 && x<n && y<m) {
					// 0이여서 갈수없거나 기방문한 곳이면 안
					if(a[x][y] != 0&&visited[x][y]) {
						//이제 갈 수 있는곳이다.
						visited[x][y] = true;
						//핵심
						a[x][y] = a[now[0]][now[1]] +1;
						queue.add(new int[] {x,y});
					}
				}
			}
		}
		
	}
}