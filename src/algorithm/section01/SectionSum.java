package algorithm.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 구간합은 합배열을 이용하여 시간 복잡도를 더 줄이기 위해 사용하는 특수한 목적의 알고리즘이다.
// 합배열을 만드는 공식 s[i] = s[i-1] + a[i]

// 수 n개가 주어졌을때 i번째 수에서 j번째 수까지의 합을 구하는 프로그램을 작성하시오.
class SectionSum {
	public static void main(String[] args) throws IOException{
		//숫자가 클때는 버퍼를 받아서 사용
		BufferedReader bufferedReader = 
				new BufferedReader(new InputStreamReader(System.in));
		//토큰으로 값을 분리해서 사용
		StringTokenizer stringTokenizer = 
				new StringTokenizer(bufferedReader.readLine());
		
		//숫자갯수
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
		//질의갯수
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
		long[] s = new long[suNo + 1]; //0번째 인덱스 무시
		
		stringTokenizer = 
				new StringTokenizer(bufferedReader.readLine());
		
		//합배열 생성
		for(int i=1; i<=suNo; i++) {
			s[i] = s[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		// 질의 갯수만큼 반복해서 구간합 출력
		for(int q=0; q<quizNo; q++) {
			stringTokenizer = 
					new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(s[j] - s[i-1]);
		}
	}
}