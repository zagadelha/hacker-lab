package lab.streams;

import java.util.List;

import util.entity.Person;

public class StreamSorting {

	public static void main(String[] args) {

		List<Person> people = new Person().feed();
//		Stream<Person> stream = people.stream().filter(o -> o.getName().equals("Bia").sorted(Comparator.comparing(Person::getName)));

	}

}
