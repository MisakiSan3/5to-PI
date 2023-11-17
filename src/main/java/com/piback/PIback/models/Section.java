package com.piback.PIback.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "section")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name_s", length = 20)
    private String name_s;

    @Column(name = "percentage_value")
    private long percentage_value;

    //@OneToMany(mappedBy = "section")
    //private List<Activity> activities;

    @ManyToOne
    @JoinColumn(name = "finalgrade_id")
    private FinalGrade finalGrade;


    

}
