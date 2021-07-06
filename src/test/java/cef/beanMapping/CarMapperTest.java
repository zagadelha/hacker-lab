package cef.beanMapping;

import org.junit.Assert;
import org.junit.Test;

public class CarMapperTest {

	@Test
	public void testEntityToDto() {

		Car car = new Car("Ford", 5);
		CarDto carDto = CarMapper.INSTANCE.toDto(car);
		Assert.assertEquals(carDto.getModelName(), "Ford");
		Assert.assertEquals(carDto.getSeatCount(), "5");
	}

	@Test
	public void testDtoToEntity() {

		CarDto dto = new CarDto("Porche", "2");
		Car car = CarMapper.INSTANCE.toEntity(dto);
		Assert.assertEquals(car.getModel(), "Porche");
		Assert.assertEquals(car.getSeats(), 2);
	}

}
