// 배열의 특징
// 인덱스를 사용하여 값에 접근할 수 있다.
// 새로운 값을 삽입하거나 특정 인덱스에 있는 값을 삭제하기 어렵다. 
// 배열의 크기는 선언할때 지정할 수 있으며 한 번 선언하면 크기를 늘리거나 줄일 수 없다. 

// 리스트의 특징 
// 값과 포인터를 묶은 노드라는 것을 포인터로 연결한 자료구조이다. 
// 인덱스가 없으면 head 포인터부터 순서대로 접근해야 한다. 접근하는 속도가 느리다.
// 데이터를 삽입하거나 삭제하는 연산속도가 빠르다 .
// 선언할때 크기를 별로도 지정하지 않아도 된다. 변하기 쉬운 데이터를 다룰때 적절하다.
// 포인터를 저장할 공간이 필요 하므로 배열보다 구조가 복잡하다. 

package algorithm.section01;

import java.util.Scanner;

/**
 * 입력으로 주어진 숫자 n개의 합을 구한다
 */
class NumSum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String sNum = sc.next();
		
		char[] cNum = sNum.toCharArray();
		int sum = 0;
		
		for(int i=0; i<cNum.length; i++) {
			sum += cNum[i] - '0';
		}
		
		System.out.println(sum);
	}
}