package com.thiago.bagugatreino.service;

import com.thiago.bagugatreino.entity.Exercise;
import com.thiago.bagugatreino.entity.User;
import com.thiago.bagugatreino.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExerciseService {


    @Autowired
    ExerciseRepository repository;

    public Exercise create(Exercise exercise){
        return repository.save(exercise);
    }

    public Iterable<Exercise> getAll(){
        return repository.findAll();
    }

    public Exercise findById(Long id){
        Optional<Exercise> optionalExercise = repository.findById(id);
        return optionalExercise.orElse(null);
    }

}