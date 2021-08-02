package lab.streams;

import java.util.List;

import util.entity.Person;

public class StreamFilter2 {

	// Print only people with majority age
	public static void main(String[] args) {

		List<Person> people = Person.feed2();
		List<Person> peopleMorityAge = new PersonFilter().filter(people, p -> p.getAge() >= 18);
		peopleMorityAge.forEach(a -> System.out.println("Maior: " + a.getName()));

	}

}
