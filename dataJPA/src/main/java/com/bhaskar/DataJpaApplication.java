package com.bhaskar;

import com.bhaskar.entity.Student;
import com.bhaskar.repository.StudentRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext context = SpringApplication.run(DataJpaApplication.class, args);
		StudentRepository studentRepo = context.getBean(StudentRepository.class);
		
		Optional<Student> students = studentRepo.findById(90);
		
		if(students.isPresent()) {
			System.out.println(students.get());
		}
		
		studentRepo.deleteById(103);
		
Optional<Student> students1 = studentRepo.findById(90);
		
		if(students1.isPresent()) {
			System.out.println(students1.get());
		}
		
		
		
		
		
		
	}

}
