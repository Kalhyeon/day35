package kr.co.icia.web;

// 페이징 계산하기
public class day35_Test7 {

	public static void main(String[] args) {
		long totalcount = 123;
		long pageno = 3;
		long pagesize = 10;
		
		int a = 10;
		int b = 20;
//		같은 타입을 연산하면 결과는 그 타입이다.
//		a + b 는 int
		
		long c = 30;
//		다른 타입을 연산하면 결과는 넓은 타입이다.
//		a + c 는 long
		
		double d = 100/3;
		System.out.println(d);
//		100/3 의 타입은 int, 값은 33
//		= 할 때 int 가 double 로 변환된다.
		
		long countOfPage = ((totalcount-1)/pagesize)+1;
		System.out.println(countOfPage);

	}

}
