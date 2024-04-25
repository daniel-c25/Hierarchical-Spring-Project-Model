package application.service;

import org.springframework.stereotype.Service;

import application.controller.dto.DTOMapper;
import application.controller.dto.myentity.EntityListDTO;
import application.controller.dto.myentity.EntityRequestDTO;
import application.controller.dto.myentity.EntityResponseDTO;
import application.model.MyEntity;
import application.repository.EntityRepository;

@Service
public class EntityService {

	private EntityRepository entityRepository;
	private DTOMapper dtoMapper;
	
	public EntityService(EntityRepository entityRepository, DTOMapper dtoMapper) {
		this.entityRepository = entityRepository;
		this.dtoMapper = dtoMapper;
	}
	
	public EntityResponseDTO createEntity(EntityRequestDTO entityRequestDTO) {
		MyEntity myEntity = dtoMapper.fromEntityRequestDtoToMyEntity(entityRequestDTO);
		/*...personalized creation process, if needed...*/
		return dtoMapper.fromMyEntityToEntityResponseDto(entityRepository.save(myEntity));
	}

	public EntityListDTO getAllEntities() {
		/*...personalized fetching process, if needed...*/
		return new EntityListDTO(entityRepository.findAll());
	}
	
	public EntityResponseDTO getEntityByID(Long entityID) {
		MyEntity myEntity = entityRepository.findById(entityID).get();
		/*...personalized fetching process, if needed...*/
		return dtoMapper.fromMyEntityToEntityResponseDto(myEntity);
	}
	
	public EntityResponseDTO updateEntityByID(Long entityID, EntityRequestDTO entityRequestDTO) {
		if(entityRepository.findById(entityID).isPresent()) { //...can also work with orElseThrow()...
			MyEntity myEntity = entityRepository.findById(entityID).get();
			/*...personalized updating process...*/	
			return dtoMapper.fromMyEntityToEntityResponseDto(myEntity);
		}else return null;
	}
	
	public void deleteEntityByID(Long entityID) {
		/*...personalized deleting process, if needed...*/
		entityRepository.deleteById(entityID);
	}
	
}
