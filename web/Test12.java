package kr.co.icia.web;

// control : 제어. 프로그램의 실행 순서를 변경한다.
// 조건 : if, switch
// 반복 : for, while, do-while
// 중단, skip : break, continue
public class day35_Test12 {

	public static void main(String[] args) {
//		if 문 : 여러 개 중 하나
//		switch 문 : 조건이 많은 경우
		
		Integer[] ar = {75, 80, 70, 65, 95, 100, 60};
//		배열의 원소를 출력하시오.
//		for(int i=0; i<ar.length; i++) {
//			System.out.println(ar[i]);
//		}
		
//		배열에서 70점 이상인 점수들을 출력하시오.
//		for(int i=0; i<ar.length; i++) {
//			if(ar[i]>=70) {
//				System.out.println(ar[i]);
//			}
//		}
		
//		배열의 합계를 출력하시오 : 545
		int sum = 0;
//		for(int i=0; i<ar.length; i++) {
//			sum += ar[i];
//		}
//		System.out.println(sum);
		
//		배열에서 70점 이상인 점수의 합계를 출력하시오 : 420
//		for (int i=0; i<ar.length; i++) {
//		    if (ar[i]>=70) {
//		        sum += ar[i];
//		    }
//		}
//		System.out.println(sum);
		
//		배열에서 70~90점인 점수의 합계를 출력하시오 : 225
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>=70 && ar[i]<=90) {
				sum=sum+ar[i];
			}
		}
		System.out.println(sum);

	}

}
