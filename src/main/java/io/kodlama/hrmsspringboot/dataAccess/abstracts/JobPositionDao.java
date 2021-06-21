package io.kodlama.hrmsspringboot.dataAccess.abstracts;

import io.kodlama.hrmsspringboot.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {
}
