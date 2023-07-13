package kr.co.icia.web;

public class day35_Test13 {

	public static void main(String[] args) {
		Integer[] ar = {65, 70, 75, 100, 95, 90, 85, 80};
		
//		JS 의 of 반목문에 해당 => 향상된 for 문
//		for(Integer ob:ar) {
//			System.out.println(ob);
//		}
		
//		70~90점 사이의 합계를 출력하시오 : 400
		long sum = 0;
		for(Integer i:ar) {
			if(i>=70 && i<=90) {
				sum += i;
			}
		}
		System.out.println(sum);
		
//		70점 이상인 점수의 개수를 출력하시오 : 7
		long cnt = 0;
		for(Integer i:ar) {
			if(i>=70) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
