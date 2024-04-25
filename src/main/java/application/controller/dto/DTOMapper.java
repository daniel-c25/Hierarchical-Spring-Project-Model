package application.controller.dto;

import org.springframework.stereotype.Component;

import application.controller.dto.myentity.EntityRequestDTO;
import application.controller.dto.myentity.EntityResponseDTO;
import application.model.MyEntity;

@Component
public class DTOMapper {
	
	/* ...in this class we'll have methods which permit us to transform from
	 * dtos to entities and viceversa.
	 * */
	
	public MyEntity fromEntityRequestDtoToMyEntity(EntityRequestDTO entityRequestDTO) {
		MyEntity myEntity = new MyEntity();
		/*...mapping process...*/
		return myEntity;
	}
	
	public EntityResponseDTO fromMyEntityToEntityResponseDto(MyEntity myEntity) {
		EntityResponseDTO entityResponseDTO = new EntityResponseDTO();
		/*...mapping process...*/
		return entityResponseDTO;
	}
	
}
