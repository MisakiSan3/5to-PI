package com.piback.PIback.models;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "final_grade")
public class FinalGrade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "value")
    private double value;

    //Relaciòn con Subject
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id",referencedColumnName = "id")
    private Subject Subject;

    //Relaciòn con section
    @OneToMany(mappedBy = "final_grade", cascade = CascadeType.ALL)
    private List<Section> sections;
}
