package com.adammendak.crosswords.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class CrosswordEntry {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String value;

    @NotNull
    private String description;

}
