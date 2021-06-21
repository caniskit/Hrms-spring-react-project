package io.kodlama.hrmsspringboot.business.abstracts;

import io.kodlama.hrmsspringboot.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {

    List<JobPosition> getAll();
    JobPosition getById(int id);
}
