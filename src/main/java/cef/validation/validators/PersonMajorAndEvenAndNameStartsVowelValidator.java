package cef.validation.validators;

import cef.validation.rules.PersonAgeEvenRule;
import cef.validation.rules.PersonMajorRule;
import cef.validation.rules.PersonNameStartsVowelRule;

public class PersonMajorAndEvenAndNameStartsVowelValidator extends GenericValidator {

	public PersonMajorAndEvenAndNameStartsVowelValidator() {
		this.rules.add(new PersonMajorRule());
		this.rules.add(new PersonAgeEvenRule());
		this.rules.add(new PersonNameStartsVowelRule());
	}

}
