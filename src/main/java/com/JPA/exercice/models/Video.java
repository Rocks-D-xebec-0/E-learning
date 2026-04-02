package com.JPA.exercice.models;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SuperBuilder
@PrimaryKeyJoinColumn(name="video_id")
//@EqualsAndHashCode(callSuper = true)
//@DiscriminatorValue("video")
public class Video extends Resource {


    private int length;


}
