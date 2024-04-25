package application.controller.dto.myentity;

public class EntityRequestDTO {
	
	/* ...please have in mind that request dtos contain only fields that 
	 * we expect to see as an input from the client!
	 */
	
	private String field;
	
	public String getField() {
		return field;
	}
	
	public void setField(String field) {
		this.field = field;
	}

}
