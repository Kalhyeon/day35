package kr.co.icia.web;


// 연산자 우선 순위
// 1. 단항 : .(멤버 연산자), !, +, -, ++, --
// 2. 이항
//	2.1 산술	: +, -, *, /, %
//	2.2 비교 : 결과가 boolean
//	2.3 논리 : 결과가 boolean
// 3. 삼항 (조건) ? :
// 4. 대입
public class day35_Test9 {

	public static void main(String[] args) {
//		비교 연산
//		JS : 비교 연산과 대입 연산이 다르다.
//		==, !=, ===, !==, >, <, >=, <=
//		==, != 는 JS 가 타입을 변환하면서 비교
//		10=='10'
//		===, !== 는 JS 의 타입 변환을 금지 (또는 타입까지 비교)
		
//		오라클 : 비교 연산과 대입 연산이 같다.
//		=, <>, >, <, >=, <=
		
//		자바 : 비교 연산과 대입 연산이 다르다.
//		==, !=, >, <, >=, <=
		
		long a = 10;
		long b = 20;
		if(a>b==true) {
			System.out.println("a가 큽니다.");
		}else if(a<b==true) {
			System.out.println("b가 큽니다.");
		}
		
		if(a>b) {
			System.out.println("a가 큽니다.");
		}else {
			System.out.println("b가 큽니다.");
		}
		
//		30라인의 if 문과 36라인의 if 문의 조건은 동일하다.

	}

}
