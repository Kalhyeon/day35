package kr.co.icia.web;

public class day35_Test5 {

	public static void main(String[] args) {
		// 단항 연산자는 전위 (prefix)로 표기한다.
		// 논리 부정 !
		boolean a = true;
		System.out.println(!a);
		
		// 부호 연산자 : +, -
		long x = 10;
		long y = -x;
		
		// 이항 연산자는 중위 (infix)로 표기한다.
		long z = 3+5;
		
		// ++, -- 는 전, 후위 모두 가능하다.
		// 증감 연산을 단독으로 사용할 때는 증감한다.
		for(int i=0; i<100; ++i) {}

		// 증감 연산이 수식에서 다른 연산과 함께 사용될 때는
		// 전위는 증감부터, 후위는 증감을 나중에 한다.
		long zz = x++ + 1;		// x : 11, zz : 10
		long zzz = ++x + 1;		// x : 12, zzz : 12
		
		long z2 = ++x;			// x : 13, z2 : 13
		long z3 = x++;			// x : 14, z3 : 13
	}

}
