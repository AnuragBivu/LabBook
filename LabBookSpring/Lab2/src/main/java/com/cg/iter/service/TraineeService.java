package com.cg.iter.service;

import java.util.List;

import com.cg.iter.entitie.Trainee;

public interface TraineeService {
	Trainee find(int traineeid);
    List<Trainee> getAll();
    void create(Trainee t);
    public void delete(int traineeid);
    public void modify(Trainee t);
}
