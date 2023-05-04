package com.bhaskar.repository;

import com.bhaskar.entity.Student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>
{


	@Query(value = "delete * from Student where id:=id")
	public void deletById(int id);

	
	
	
}
