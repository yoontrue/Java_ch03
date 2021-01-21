package org.comstudy21.ch03_2;

public class Student{
	String name;
	String major;
	double score;
	int rank;
	
	public Student() {

	}

	public Student(String name, String major, double score, int rank) {
		this.name = name;
		this.major = major;
		this.score = score;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return String.format("이름 : %-20s학과 : %-15s성적 : %-10.1f등수 : %-4d", name,major,score,rank);
	}

}
