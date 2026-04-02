package com.JPA.exercice.repositories;

import com.JPA.exercice.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {

}
