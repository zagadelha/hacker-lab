package util.entity;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private int id;
	private String name;
	private int age;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	/**
	 * Return a people list to test
	 */
	public static List<Person> feed() {

		Person p1 = new Person(1, "Ana");
		Person p2 = new Person(2, "Bia");
		Person p3 = new Person(3, "Cris");

		List<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		people.add(p3);

		return people;
	}

	/**
	 * Return a people list to test
	 */
	public static List<Person> feed2() {

		Person p1 = new Person(1, "Ana", 17);
		Person p2 = new Person(2, "Bia", 18);
		Person p3 = new Person(3, "Cris", 19);

		List<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		people.add(p3);

		return people;
	}

}