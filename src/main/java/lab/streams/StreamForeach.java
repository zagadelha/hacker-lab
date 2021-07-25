package lab.streams;

import java.util.ArrayList;
import java.util.List;

import util.entity.Person;

public class StreamForeach {

	public static void main(String[] args) {

		Person p1 = new Person(1, "João");
		Person p2 = new Person(2, "Maria");
		Person p3 = new Person(3, "Pedro");

		List<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		people.add(p3);

		people.stream().forEach(p -> System.out.println(p.getId()));

	}

}
