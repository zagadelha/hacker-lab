package cef.validation.rules;

import util.entity.Person;

public class PersonAgeEvenRule extends GenericRule {

	public PersonAgeEvenRule() {
		this.setErrorMessage("This person age is not even.");
	}

	@Override
	public boolean ok(Object o) {
		Person p = ((Person) o);
		return p.getAge() % 2 == 0;
	}

}
