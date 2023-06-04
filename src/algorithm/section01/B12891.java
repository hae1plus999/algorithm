package algorithm.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//슬라이딩 윈도우 알고리즘
//2개의 포인터로 범위를 지정한 다음 범위를 유지한채로 이동하면서 문제 해결

//dna 문자열의 길이, 부분문자열의 길이
//dna 문자열
//부분문자열에 포함되어야할 acgt의 최소갯수

//9 8
//cctggattg
//2 0 1 1
//0

class B12891 {
	static int myArr[];
	static int checkArr[];
	static int checkSecret;
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int s = Integer.parseInt(st.nextToken()); //문자열 크기 
		int p = Integer.parseInt(st.nextToken()); //부분 문자열 크기 
		
		int result = 0;
		checkArr = new int[4]; //비밀번호 체크 배열 
		myArr = new int[4]; //현재 상태 배열 
		char a[] = new char[s];
		checkSecret = 0; // 몇개를 만족하는지 확인하는 수, 4개이면 모두 만족함.
		
		a = bf.readLine().toCharArray();
		st = new StringTokenizer(bf.readLine());
		
		//체크
		for(int i=0; i<4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if(checkArr[i] == 0) {
				checkSecret++;
			}
		}
		
		//부분문자열 처음받을때 세팅
		for(int i=0; i<p; i++) {
			Add(a[i]);
		}
		
		if(checkSecret == 4) result++;
		
		//슬라이딩 윈도우
		for(int i=p; i<s; i++) {
			int j = i-p;
			Add(a[i]);
			Remove(a[j]);
			if(checkSecret == 4) result++;
		}
		
		System.out.println(result);
		bf.close();
	}

	private static void Remove(char c) {
		switch (c) {
		case 'a' : 
			myArr[0]--;
			if(myArr[0] == checkArr[0]) checkSecret--;
			break;
		case 'c' :
			myArr[1]--;
			if(myArr[1] == checkArr[1]) checkSecret--;
			break;
		case 'g' :
			myArr[2]--;
			if(myArr[2] == checkArr[2]) checkSecret--;
			break;
		case 't' :
			myArr[3]--;
			if(myArr[3] == checkArr[3]) checkSecret--;
			break;
		}
	}

	private static void Add(char c) {
		switch (c) {
			case 'a' : 
				myArr[0]++;
				if(myArr[0] == checkArr[0]) checkSecret++;
				break;
			case 'c' :
				myArr[1]++;
				if(myArr[1] == checkArr[1]) checkSecret++;
				break;
			case 'g' :
				myArr[2]++;
				if(myArr[2] == checkArr[2]) checkSecret++;
				break;
			case 't' :
				myArr[3]++;
				if(myArr[3] == checkArr[3]) checkSecret++;
				break;
		}
		
	}
	
}
