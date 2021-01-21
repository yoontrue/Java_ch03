package com.yoontrue;

// class는 사용자 정의 타입
// 사용자가 임의로 만들어서 쓰는 데이터타입
// 클래스 = 필드 + 메소드
// 필드 : 속성(변수)
// 메소드 : 일(함수)
class Point {	// 포인트라는 타입을 만든거
	int x;
	int y;
}

public class Ch03Ex02Refer {
	
	static void swap(Point p) {
		int temp = p.x;
		p.x = p.y;
		p.y = temp;
		
	}
	
	public static void main(String[] args) {
		Point p1;	// Point 타입의 참조변수 p1을 선언했다.
		p1 = new Point();
		
		p1.x = 100;
		p1.y = 200;
		
		swap(p1);
		
		System.out.println("p1 = "+ p1.x + "  p1.y = " + p1.y);
	}


}
