package com.JPA.exercice.models;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@Entity
@SuperBuilder
@AllArgsConstructor
//@Table(name = "AUTHOR_TBL")
public class Author extends BaseEntity {



    @Column(
            name = "first_name",
            length = 30
    )
    private String firstName ;
    @Column
    private String lastName ;
    @Column(
            unique = true,
            nullable = false
    )
    private String email ;
    @Column
    private String age;


    @Column(
            updatable = false,
            nullable = true
    )
    private LocalDateTime createdAt ;


    @Column(
            insertable = false)
    private LocalDateTime lastModified ;



    @ManyToMany(mappedBy = "authors")
    private List<Course> courses ;

}

