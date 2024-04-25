package application.controller.dto.myentity;

public class EntityResponseDTO {

	/* ...please have in mind that responses dtos contain only fields that
	 * we want the client to receive!
	 * */
	
	private Long entityID;
	private String field;
	
	public Long getEntityID() {
		return entityID;
	}

	public void setEntityID(Long entityID) {
		this.entityID = entityID;
	}

	public String getField() {
		return field;
	}
	
	public void setField(String field) {
		this.field = field;
	}

}
