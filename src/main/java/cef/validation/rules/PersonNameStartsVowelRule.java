package cef.validation.rules;

import cef.string.StringUtil;
import util.entity.Person;

public class PersonNameStartsVowelRule extends GenericRule {

	public PersonNameStartsVowelRule() {
		this.setErrorMessage("This person name dont starts with vowel.");
	}

	@Override
	public boolean ok(Object o) {
		Person p = ((Person) o);
		return StringUtil.isFirstLetterVowel(p.getName());
	}

}
