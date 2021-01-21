package org.comstudy21.ch03_2;
import java.util.Scanner;

public class StudentManager {
	static Scanner scan = new Scanner(System.in);
	static Scanner scan2 = new Scanner(System.in);		// 문자열 입력용 스캐너
	static final int MAX = 50;
	static Student[] stArr = new Student[MAX];
	static int top = 0;	// max를 카운팅하는거 max보다 크면 그만 입력되도록 하려고 만든 변수...
	static int no;
	static Student mkStudent() {
		Student student = new Student();
		System.out.print("성명>>>  ");
		student.name = scan2.nextLine();
		System.out.print("학과>>>  ");
		student.major = scan.next();
		System.out.print("성적>>>  ");
		student.score = scan.nextDouble();
		System.out.print("등수>>>  ");
		student.rank = scan.nextInt();
		return student;
	}
	
	static int menu() {
		// 여기서 no를 선언하면 초기화를 0등으로... 꼭 해야하는데 예외가 발생되고 try-catch를 지나오
		// no에 초기값인 0이 남아있어서 자꾸 해당 사항없다는 경고 문구가 뜬다. (switch-case 구문)
		// 그래서 no를 필드에 선언해줌. 필드에 선언하면 초기화 안해도 돼서!
		System.out.println("1.input  2.output  3.search  4.modify  5.delete  6.end");
		System.out.print("Choice>>> ");
		try {
			no = scan.nextInt();
		}catch (Exception e) {
			System.out.println("정수만 입력 가능합니다!");
			scan.nextLine();
			menu();		// 재귀호출(자기 자신을 다시 호출)
		}
		return no;
	}
	
	static void input() {
		// stArr배열의 top번지에 객체를 생성하고 	top을 증가한다.
		if(top >= MAX) {
			System.out.println("더 이상 입력할 수 없습니다.");
			return;
		}
		stArr[top++] = mkStudent();
		System.out.println(top + "번째 입력입니다.");
		System.out.println(": : :   INPUT   : : :");
	}
	
	static void output() {
		System.out.println(": : :   OUTPUT   : : :");
		for(int i=0; i < top; i++) {
			System.out.println(stArr[i]);
		}
	}
	
	static void search() {
		System.out.println(": : :   SEARCH   : : :");
		String searchName;
		System.out.print("찾을 사람 이름>>> ");
		searchName = scan2.nextLine();
		for(int i=0; i < top; i++) {
			if(stArr[i].name.equals(searchName)) {
			System.out.println(stArr[i]);
			}
		}
	}
	
	static void modify() {
		System.out.println(": : :   MODIFY   : : :");
	}
	
	static void delete() {
		System.out.println(": : :   DELETE   : : :");
	}
	
	static void end() {
		System.out.println(": : :   END   : : :");
		System.out.println("프로그램을 종료합니다. 수고하셨습니다.");
		System.exit(0);	// 강제종료!
	}

	public static void main(String[] args) {
		while(true) {
			int no = menu();
			switch(no) {
			case 1 : input(); break;
			case 2 : output(); break;
			case 3 : search(); break;
			case 4 : modify(); break;
			case 5 : delete(); break;
			case 6 : end(); break;
			default : System.out.println("경고 : 해당사항 없습니다!");
			}
			System.out.println("----------------------------------");
		}
	}
}
