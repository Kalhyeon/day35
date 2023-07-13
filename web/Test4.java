package kr.co.icia.web;

public class day35_Test4 {

	public static void main(String[] args) {
		int x = 10, y = 10;
		for(int i=1; i<=3; i++) {
			System.out.println(--x);
			System.out.println(y--);
			System.out.println(x==y);
		}
	}

}
