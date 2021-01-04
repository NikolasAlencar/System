package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many course? ");
		int qt = sc.nextInt();
		List<String> listCourse = new ArrayList<>();
		for (int i=0; i<qt; i++) {
			System.out.print("Enter with a name course: ");
			String name = sc.next();
			listCourse.add(name);
		}
		
		Set<Student> set = new HashSet<>();
		
		for (String course : listCourse) {
			System.out.print("How many students for course " +course+ " ? ");
			int quantity = sc.nextInt();
			for (int i=0; i<quantity; i++) {
				set.add(new Student(sc.nextInt()));
			}
		}
		System.out.print("Total students: " + set.size());
		sc.close();
	}

}