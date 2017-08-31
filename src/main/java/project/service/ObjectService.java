package project.service;

import project.model.ObjectEntity;
import project.model.ObjectEntity_;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Stateless
public class ObjectService extends AbstractService<ObjectEntity> {
    @PersistenceContext(name = "Webtrial-persistence-unit")
    private EntityManager entityManager;

    public ObjectService() {super(ObjectEntity.class);}

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public ObjectEntity findById(Long id) {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<ObjectEntity> cq = cb.createQuery(ObjectEntity.class);
        Root<ObjectEntity> model = cq.from(ObjectEntity.class);
        cq.where(cb.equal(model.get(ObjectEntity_.id), id));
        return getEntityManager().createQuery(cq).getSingleResult();
    }
}
