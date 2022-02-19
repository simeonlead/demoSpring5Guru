package com.example.demo.Student;

import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return arg ->{
            Student Simeon = new Student(
                    "Simeon",
                    "simeo@gmail.com",
                LocalDate.of(1990, Month.JANUARY, 05)
            );
            Student Alex = new Student(
                    "Alex",
                    "Alex@gmail.com",
                    LocalDate.of(1993, Month.JANUARY, 05)
            );
            Student wale = new Student(
                    "wale",
                    "waleg@gmail.com",
                    LocalDate.of(1992, Month.JANUARY, 15)
            );
            Student Lead = new Student(
                    "Lead",
                    "Lead@gmail.com",
                    LocalDate.of(1994, Month.JANUARY, 3)

            );
            repository.saveAll(
                    List.of(Simeon, Alex, wale, Lead)
            );
       };
    }
}
