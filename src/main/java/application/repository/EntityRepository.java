package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.MyEntity;

@Repository
public interface EntityRepository extends JpaRepository<MyEntity, Long>{ 
	//the nominated class and the type after it must be the entity and the type of its ID
	
}
