package project.model;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ObjectEntity.class)
public abstract class ObjectEntity_ {

	public static volatile SingularAttribute<ObjectEntity, String> name;
	public static volatile SingularAttribute<ObjectEntity, Integer> id;
	public static volatile SingularAttribute<ObjectEntity, Timestamp> create_date;
	public static volatile SingularAttribute<ObjectEntity, Timestamp> update_date;

}

