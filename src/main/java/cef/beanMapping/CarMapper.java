package cef.beanMapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

	CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

	@Mapping(source = "seats", target = "seatCount")
	@Mapping(source = "model", target = "modelName")
	CarDto toDto(Car car);

	@Mapping(source = "seatCount", target = "seats")
	@Mapping(source = "modelName", target = "model")
	Car toEntity(CarDto dto);

}
