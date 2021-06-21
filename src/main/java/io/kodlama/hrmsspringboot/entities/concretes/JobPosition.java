package io.kodlama.hrmsspringboot.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="job_positions")
public class JobPosition {

    @Id
    @GeneratedValue
    @Column(name = "position_id")
    int id;
    @Column(name="position_name")
    String name;
}
