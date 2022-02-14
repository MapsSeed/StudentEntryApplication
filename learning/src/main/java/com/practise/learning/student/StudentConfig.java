package com.practise.learning.student;

import com.practise.learning.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student aditya = (new Student("aditya"
                    ,"adity@gmail.com", LocalDate.of(2000, Month.APRIL,5)));
            Student yash = (new Student("yash"
                    ,"yash@gmail.com", LocalDate.of(1999, Month.MARCH,7)));
            Student anjali = (new Student("anjali"
                    ,"anjali21@gmail.com", LocalDate.of(2003, Month.APRIL,21)));

            repository.saveAll(List.of(aditya,yash,anjali));
        };
    }

}
