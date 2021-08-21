package cef.validation.rules;

import util.entity.Person;

public class PersonMajorRule extends GenericRule {

	public PersonMajorRule() {
		this.setErrorMessage("This person is not major.");
	}

	@Override
	public boolean ok(Object o) {
		Person p = ((Person) o);
		return p.getAge() >= 18;
	}

}
