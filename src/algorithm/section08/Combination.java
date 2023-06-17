package algorithm.section08;

import java.util.Scanner;

// 조합 중요
// 점화식 도출,  

class Combination{
	static int n, k;
	static int d[][];
	public static void maina(String[] args) {
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		d = new int[n+1][n+1];
		//초기화
		for(int i=0; i<n; i++) {
			d[i][i] = 1;
			d[i][0] = 1;
			d[i][1] = 1;
		}
		//점화식으로 배열 완성하기
		for(int i=2; i<=n; i++) {
			for(int j=1; j<i; j++) {
				d[i][j] = d[i-1][j] + d[i-1][j-1];
			}
		}
		System.out.println(d[n][k]);
	}
}