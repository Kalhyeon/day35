package kr.co.icia.web;

// 비교 연산 : 하나의 조건
// 논리 연산 : 여러 조건들을 연결한 최종 결과
public class day35_Test10 {

	public static void main(String[] args) {
		// 장학금 조건 : 본교 재학생으로 성적이 90점 이상이며 품행이 방정한 학생
		long kor = 70;
		long eng = 80;
		
//		&& 는 조건 중 하나라도 거짓이라면 거짓이다.
		System.out.println(kor>=70 && eng>=70);
		
//		|| 는 조건 중 하나만 참이면 참
		System.out.println(kor>=70 || eng>=70);
		
		boolean result = ++kor>=70 && ++eng>=70;
		System.out.println(kor);		// 71
		System.out.println(eng);		// 71
		
		result = ++kor>=90 && ++eng>=90;
		System.out.println(kor);		// 72
		System.out.println(eng);		// 71
		
//		자바는 논리 연산의 결과가 정해지면 연산을 중지한다 => short circuit
//		22라인에서 ++kor>=90 의 결과는 거짓이다.
//				그리고 && 를 만나는 순간 result 의 값은 false 로 결정된다.
//				따라서 자바는 연산을 중지, ++eng>=90 은 수행하지 않는다.

	}

}
