package io.kodlama.hrmsspringboot.business.concretes;

import io.kodlama.hrmsspringboot.business.abstracts.JobPositionService;
import io.kodlama.hrmsspringboot.dataAccess.abstracts.JobPositionDao;
import io.kodlama.hrmsspringboot.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {

    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao){
        this.jobPositionDao=jobPositionDao;
    }
    @Override
    public List<JobPosition> getAll() {
        return this.jobPositionDao.findAll();
    }

    @Override
    public JobPosition getById(int id) {
        return jobPositionDao.findById(id).get();
    }
}
