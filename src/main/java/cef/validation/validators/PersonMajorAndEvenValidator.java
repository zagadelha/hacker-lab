package cef.validation.validators;

import cef.validation.rules.PersonAgeEvenRule;
import cef.validation.rules.PersonMajorRule;

public class PersonMajorAndEvenValidator extends GenericValidator {

	public PersonMajorAndEvenValidator() {
		this.rules.add(new PersonMajorRule());
		this.rules.add(new PersonAgeEvenRule());
	}

}
