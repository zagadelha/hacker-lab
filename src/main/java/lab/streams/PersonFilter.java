package lab.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import util.entity.Person;

public class PersonFilter {

	public List<Person> filter(List<Person> input, Predicate<Person> matcher) {

		List<Person> output = new ArrayList<>();
		for (Person person : input) {
			if (matcher.test(person)) {
				output.add(person);
			}
		}
		return output;
	}

}
