package algorithm.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

//절댓값 힙구하기
// 연산의 갯수
//우선순위 큐
class B11286 {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2) ->{
			int first_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			if(first_abs == second_abs) {
				return o1>o2 ? 1 : -1; //절댓값이 같은 경우 음수 우선
			}
			return first_abs - second_abs; //절댓값 작은 데이터 우선
		});
		
		for(int i=0; i<n;i++) {
			int request = Integer.parseInt(br.readLine());
			if(request == 0) {
				if(queue.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println(queue.poll());
				}
			} else {
				queue.add(request);
			}
		}
	}
}

