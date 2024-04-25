package application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.controller.dto.myentity.EntityListDTO;
import application.controller.dto.myentity.EntityRequestDTO;
import application.controller.dto.myentity.EntityResponseDTO;
import application.service.EntityService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("api/<versionNumber>/entity")
public class EntityController {
	
	private EntityService entityService;
	
	public EntityController(EntityService entityService) {
		this.entityService = entityService;
	}
	
	@PostMapping("create")
	public EntityResponseDTO postMethodName(@RequestBody EntityRequestDTO entityRequestDTO) {
		return entityService.createEntity(entityRequestDTO);
	}
	
	@GetMapping("getAll")
	public EntityListDTO getMethodName() {
		return entityService.getAllEntities();
	}
	
	@GetMapping("getByID/{id}")
	public EntityResponseDTO getEntityByID(@PathVariable Long entityID) {
		return entityService.getEntityByID(entityID);
	}
	
	@PutMapping("updateByID/{id}")
	public EntityResponseDTO updateEntityByID(@PathVariable Long entityID, @RequestBody EntityRequestDTO entityRequestDTO) {
		return entityService.updateEntityByID(entityID, entityRequestDTO);
	}
	
	@DeleteMapping("deleteByID/{id}")
	public void deleteEntityByID(@PathVariable Long entityID) {
		entityService.deleteEntityByID(entityID);
	}
	
}
