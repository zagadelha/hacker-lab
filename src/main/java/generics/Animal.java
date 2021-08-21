package generics;

public abstract class Animal<T> {

	private T animal;

	public void set(T animal) {
		this.animal = animal;
	}

	public T get() {
		return this.animal;
	}

}
