package lab.streams;

import java.util.ArrayList;
import java.util.List;

import util.entity.Person;

public class StreamFilter {

	// Print only people with even numbers using Lambda Stream
	public static void main(String[] args) {

		Person p;
		List<Person> people = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			p = new Person(i, "Nome_" + i);
			people.add(p);
		}

		people.stream().filter(p2 -> p2.getId() % 2 == 0).forEach(p2 -> System.out.println(p2.getName()));

	}

}
