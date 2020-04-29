package com.cg.iter.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cg.iter.entitie.Trainee;


@Repository
public class TraineeDAOImpl implements TraineeDAO {

    @PersistenceContext
    private EntityManager em;
     
    public void save(Trainee t) {
        em.persist(t);
        em.flush();
    }

    public Trainee findById(Integer traineeid) {
        return em.find(Trainee.class, traineeid);
    }
   
    public List<Trainee> findAll() {
        Query q = em.createQuery("from Trainee t");
        return q.getResultList();
    }


	public void delete(Integer traineeid) {
		Trainee tr= em.find(Trainee.class, traineeid);
		em.remove(tr);
		
	}

	public void modify(Trainee t) {
		em.merge(t);
	}
}


