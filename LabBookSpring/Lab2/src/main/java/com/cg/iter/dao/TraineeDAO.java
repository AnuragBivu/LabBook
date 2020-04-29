package com.cg.iter.dao;

import java.util.List;

import com.cg.iter.entitie.Trainee;



public interface TraineeDAO {
    public void save(Trainee t);
    public Trainee findById(Integer traineeid);
    public List<Trainee> findAll();
	public void delete(Integer traineeid);
	public void modify(Trainee t);
}
