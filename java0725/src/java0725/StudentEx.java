package java0725;

import java.util.Arrays;
import java.util.Comparator;

public class StudentEx {

	public static void main(String[] args) {
		Student[] students = {
				new Student("홍길동", 57),
				new Student("기길동", 87),
				new Student("강길동", 69),
				new Student("천길동", 76),
				new Student("박길동", 95)
				
		};
		
		Comparator<Student> c = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o1.getScore(), o2.getScore()); // score 점수 순으로 정렬
			}
		};
		
		// 배열을 sort로 정렬
		
		Arrays.sort(students, c);
		for (Student st : students) {
			System.out.println(st);
		}
	}

}
