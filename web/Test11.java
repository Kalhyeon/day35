package kr.co.icia.web;

public class day35_Test11 {

	public static void main(String[] args) {
		// 107페이지의 1~4번을 작성하시오.
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		int score = 85;
		String result = (!(score>90))?"가":"나";
		System.out.println(result);
		
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils/students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils%students;
		System.out.println(pencilsLeft);
		
		int value = 356;
		System.out.println(value/100*100);
		System.out.println(value-56);
		System.out.println(value-value%100);
		
//		1. 우선 순위 : 단항 이항 삼항 대입
//		2. 증감 연산좌 전위, 후위의 차이
//		3. 같은 타입을 연산하면 결과도 그 타입, 다른 타입을 연산하면 다른 타입
//		4. 산술 연산은 끝까지 계산, boolean 연산은 결과가 나오면 중단
	}

}
