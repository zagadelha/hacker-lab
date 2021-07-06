package cef.beanMapping;

public class CarDto {

	private String modelName;
	private String seatCount;

	public CarDto(String modelName, String seatCount) {
		super();
		this.modelName = modelName;
		this.seatCount = seatCount;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(String seatCount) {
		this.seatCount = seatCount;
	}

}
