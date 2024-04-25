package application.controller.dto.myentity;

import java.util.List;

import application.model.MyEntity;

public class EntityListDTO {
	
	/* ...we use this type of class to have control over the collections
	 * (WE CAN ALSO HAVE ONES IN RESPONSE OR IN REQUEST!!!)
	 * */
	
	private List<MyEntity> myEntities;

	public EntityListDTO() {} 

	public EntityListDTO(List<MyEntity> myEntities) {
		this.myEntities = myEntities;
	}

	public List<MyEntity> getMyEntities() {
		return myEntities;
	}

	public void setMyEntities(List<MyEntity> myEntities) {
		this.myEntities = myEntities;
	}
	
}
