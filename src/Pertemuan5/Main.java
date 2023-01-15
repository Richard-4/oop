package Pertemuan5;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		new Main();
	}

	// Association -> Hubungan yang tidak saling memiliki
	// meja - kursi kalo meja hilang kursi akan tetap jadi kursi vice versa

	// Aggregation -> Hubungan yang "has-a"
	// mahasiswa -> matkul

	// Composition -> Hubungan yang "part-of"
	// mahasiswa - NIM

	public Main() {
		ArrayList<Course> courses = new ArrayList<>();
		Id id = new Id("250160903", "250170314");
		Student s = new Student("Budi", 20, courses, id);

		University u = new University("Binus", "Jl. Anggrek");
		System.out.println(s.getName() + " is studing in " + u.getName());

		courses.add(new Course("COMP1234", "Object Oriented Programming"));
		courses.add(new Course("COMP2345", "Algorithm and Programing"));

		System.out.println(s.getName() + " is learning " + s.getCourses().get(0).getName());
	}
}