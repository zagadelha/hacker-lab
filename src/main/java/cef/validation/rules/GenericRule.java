package cef.validation.rules;

public abstract class GenericRule {

	private String errorMessage;

	public GenericRule() {
	}

	public GenericRule(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * Method to be implemented by concrete class to validate if informed object
	 * achieve de rule
	 * 
	 * @param o
	 * @return
	 */
	public abstract boolean ok(Object o);

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
