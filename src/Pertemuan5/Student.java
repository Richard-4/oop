package Pertemuan5;

import java.util.ArrayList;

public class Student {

	private String name;
	private int age;
	private ArrayList<Course> courses;
	private Id id;

	public Student(String name, int age, ArrayList<Course> courses, Id id) {
		super();
		this.name = name;
		this.age = age;
		this.courses = courses;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

}
