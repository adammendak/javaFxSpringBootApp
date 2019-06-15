package com.adammendak.crosswords.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class CrosswordEntry {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String value;

    @NotNull
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Override
    public String toString() {
        return "CrosswordEntry{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user.getUserName() +
                '}';
    }
}
