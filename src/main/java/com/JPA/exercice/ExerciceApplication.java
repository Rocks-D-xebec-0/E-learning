package com.JPA.exercice;

import com.JPA.exercice.models.Author;
import com.JPA.exercice.models.Video;
import com.JPA.exercice.repositories.AuthorRepository;
import com.JPA.exercice.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExerciceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciceApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(
            AuthorRepository authorRepository,
            VideoRepository videoRepository
    ) {
        return args -> {
            /*var author = Author.builder()
                    .firstName("John")
                    .lastName("Doe")
                    .age("20")
                    .email("hem@qui.com")
                    .build();

            authorRepository.save(author);*/

                  var video = Video.builder()
                          .name("Spring Boot Tutorial")
                    .length(120)
                          .url("")
                    .build();


                  videoRepository.save(video);
        };


    }

}
