package com.ty.emptask.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task-gen")
    @SequenceGenerator(name = "task-gen", initialValue = 101, allocationSize = 1)
    private int taskId;
    private String taskName;
    private int duration;

    @Enumerated(EnumType.STRING)
    private Status taskStatus;

    @ManyToOne
    private Employee employee;
}
