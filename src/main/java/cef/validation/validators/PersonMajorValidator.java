package cef.validation.validators;

import cef.validation.rules.PersonMajorRule;

public class PersonMajorValidator extends GenericValidator {

	public PersonMajorValidator() {
		this.rules.add(new PersonMajorRule());
	}

}
