package application.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "my_entity")
public class MyEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "entity_id")
	private Long entityID;
	private String field;
	
	/*------------
	 * after instance variables, add a section containing relations with other entities
	 * 
	 * format to follow...
	 * 
	 * @<RelationType> ex- OneToMany (is important on which side of the relation you're on)
	 * @JoinColumn(mappedBy = "otherEntityID")
	 * private OtherEntity otherEntityID;
	 * 
	 * ...with their own getters and setters...
	 * 
	 * public OtherEntity getOtherEntityID(){
	 * 	return otherEntityID;
	 * }
	 * 
	 * public void setOtherEntityID(OtherEntity otherEntityID){
	 * 	this.otherEntityID = otherEntityID;
	 * } 
	 * 
	 * (REMEMBER TO UPDATE HASH AND EQUALS!!!)
	 * 
	 *------------
	 * */
	
	public Long getEntityID() {
		return entityID;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	@Override
	public int hashCode() {
		return Objects.hash(entityID, field);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyEntity other = (MyEntity) obj;
		return Objects.equals(entityID, other.entityID) && Objects.equals(field, other.field);
	}
	
}
