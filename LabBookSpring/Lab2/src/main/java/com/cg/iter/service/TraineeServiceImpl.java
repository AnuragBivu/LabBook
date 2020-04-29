package com.cg.iter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cg.iter.dao.TraineeDAO;
import com.cg.iter.entitie.Trainee;
import com.cg.iter.exceptions.ApplicationException;


@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {

    @Autowired private TraineeDAO dao;
    
    @Transactional(readOnly=true)
    
    public Trainee find(int traineeid) {
        Trainee t=dao.findById(traineeid);
    	if(t!=null)
    		return dao.findById(traineeid);
    	else
    		 throw new ApplicationException("Trainee with "+traineeid+" doesn't exists!");
    }

    @Transactional(readOnly=true)
    
    public List<Trainee> getAll() {
        return dao.findAll();
    }

    @Transactional(propagation=Propagation.REQUIRED)
    
    public void create(Trainee p) {
    	try {
        dao.save(p);
    	}
    	catch(Exception e) {
           throw new ApplicationException("Trainee with "+p.getTraineeId()+" already exists!");
    	}
    }

	public void delete(int traineeid) {
		// TODO Auto-generated method stub
		Trainee t=dao.findById(traineeid);
		if(t!=null){
		dao.delete(traineeid);
		}
		else{
	           throw new ApplicationException("Trainee with "+traineeid+" doesn't exists!");
	    	}
	}

	public void modify(Trainee t) {
		// TODO Auto-generated method stub
		Trainee t1=dao.findById(t.getTraineeId());
		
		if(t1!=null){
			dao.modify(t);
		}
		else
		           throw new ApplicationException("Trainee with "+t1.getTraineeId()+" doesn't exists!");
		    	
	}

}
