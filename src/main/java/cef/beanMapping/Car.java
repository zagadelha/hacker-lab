package cef.beanMapping;

public class Car {

	private String model;
	private int seats;

	public Car(String model, int seats) {
		super();
		this.model = model;
		this.seats = seats;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

}
