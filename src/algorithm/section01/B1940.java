// 1번째 줄에 갑옷을 만들 수 있는 개수를 출력
// 투포인트 문제
package algorithm.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1940 {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); //재료의 갯수
		int m = Integer.parseInt(br.readLine()); //갑옷이 되는 번호
		int[] a = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		
		int count = 0;
		int i = 0; //a[0] -> min
		int j = n-1; //a[n-1] -> max
		
		while(i<j) {
			if(a[i] + a[j] < m) i++;
			else if(a[i] + a[j] > m) j--;
			else {
				count++;
				i++; j--;
			}
		}
		System.out.println(count);
	}
}