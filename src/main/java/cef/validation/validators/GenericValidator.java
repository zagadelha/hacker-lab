package cef.validation.validators;

import java.util.HashSet;
import java.util.Set;

import cef.validation.rules.GenericRule;

public abstract class GenericValidator {

	Set<GenericRule> rules = new HashSet<>();

	/**
	 * Constructor to build a set of rules
	 * 
	 * @param GenericRule... rules
	 */
	public GenericValidator(GenericRule... rules) {
		for (GenericRule r : rules) {
			this.rules.add(r);
		}
	}

	/**
	 * Add new rule to set of rules
	 * 
	 * @param GenericRule r
	 */
	public void addRule(GenericRule r) {
		this.rules.add(r);
	}

	/**
	 * Verifica todas as regras de negócio do objeto informado e lança uma exceção
	 * caso alguma regra não seja verdadeira.
	 * 
	 * @param obj Objeto a ser analisado
	 * @return True/False
	 */
	public boolean isValid(Object o, boolean throwException) throws IllegalArgumentException {
		for (GenericRule r : rules) {
			if (!r.ok(o)) {
				if (throwException) {
					throw new IllegalArgumentException(r.getErrorMessage());
				} else {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Verifica todas as regras de negócio do objeto informado e retorna se é
	 * verdadeiro/falso.
	 * 
	 * @param obj Objeto a ser analisado
	 * @return True/False
	 */
	public boolean isValid(Object o) {
		return this.isValid(o, false);
	}

}
