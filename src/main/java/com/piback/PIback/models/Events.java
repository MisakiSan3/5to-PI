package com.piback.PIback.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "events")
public class Events {
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name_p", length = 50)
    private String name_p;

    @Column(name = "start", length = 50)
    private String start;

     @Column(name = "end", length = 50)
    private String end;

     @Column(name = "description", length = 250)
    private String description;

     @OneToMany(mappedBy = "events", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EventCategory> categories = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private Teacher teacher;
}
