package util.entity;

import java.util.ArrayList;
import java.util.List;

public class Person {

	int id;
	String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	/**
	 * Return a people list to test
	 */
	public List<Person> feed() {

		Person p1 = new Person(1, "Ana");
		Person p2 = new Person(2, "Bia");
		Person p3 = new Person(3, "Cris");

		List<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		people.add(p3);

		return people;
	}

}