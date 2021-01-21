package com.yoontrue;

import java.util.Scanner;

class Student{
	String name;
	String major;
	double score;
	int rank;
	
	public Student() {
		// 디폴트 생성자^^
		System.out.println("디폴트 생성자 호출 ");
	}
	
	// 오버로드 - 같은클래스 같은 이름의 메소드를 추가 해 준다.
	// 시그너처 - 매개변수의 타입과 개수.
	public Student(String name, String major, double score, int rank) {
		this.name = name;
		this.major = major;
		this.score = score;
		this.rank = rank;
	}

	// 오버라이드 - 상속관계 부모의 멤버를 재정의한다.
	@Override
	public String toString() {
		return String.format("이름 : %-5s \t학과 : %-15s \t성적 : %-8.1f \t등수 : %-4d", name,major,score,rank);
	}
}
public class Ch03Ex04StudentEx {
	static Scanner scan = new Scanner(System.in);
	static Scanner scan2 = new Scanner(System.in);
	static final int MAX = 50;
	static Student[] stArr = new Student[MAX];
	static int top = 0;	// max를 카운팅하는거 max보다 크면 그만 입력되도록 하려고 만든 변수...
	
	static Student mkStudent() {
		Student student = new Student();
		System.out.println("성명>>>  ");
		student.name = scan2.nextLine();
		System.out.println("학과>>>  ");
		student.major = scan.next();
		System.out.println("성적>>>  ");
		student.score = scan.nextDouble();
		System.out.println("등수>>>  ");
		student.rank = scan.nextInt();
		
		return student;
	}
	
	public static void main(String[] args) {
		
		Student[] arr = new Student[2];
		
		// 생성자 오버로딩이 되었을때는 디폴트 생성자를 명시적으로 추가해야 한다.
		// 생성자 오버로딩이 되었을 때는 컴파일러가 디폴트 생성자를 만들지 않는다.
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = new Student();
//			System.out.println("성명>>>  ");
//			arr[i].name = scan2.nextLine();
//			System.out.println("학과>>>  ");
//			arr[i].major = scan.next();
//			System.out.println("성적>>>  ");
//			arr[i].score = scan.nextDouble();
//			System.out.println("등수>>>  ");
//			arr[i].rank = scan.nextInt();
//		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = mkStudent();
		}
		
//		System.out.println(Arrays.toString(arr));
		
		for(Student st : arr) {
			System.out.println(st);
		}
	}
	
	public static void test(String[] args) {
		//	성명 학과 성적 등수
		Student kim = new Student("홍길동", "컴퓨터공학",4.5,10);
//		Student kim = new Student();
//		kim.name = "홍길동";
//		kim.major = "컴퓨터공학";
//		kim.score = 4.5;
//		kim.rank = 10;
		Student lee = new Student("이순신", "웹디자인", 5.0, 1);
		Student park = new Student("박혁거세", "창업과", 4.8, 1);
//		System.out.println(kim);
//		System.out.println(lee);
//		System.out.println(park);
		
		Student[] stdArr = new Student[3];
		stdArr[0] = kim;
		stdArr[1] = lee;
		stdArr[2] = park;
		
		stdArr[1].name = "이순자";
		stdArr[1].major = "가정학과";
		
		for(Student std : stdArr) {
			System.out.println(std);
		}
		
	}
}
