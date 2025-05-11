package edu.smc.databasedemo.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>{
// table name, primary key is in int but it only support Integer
}
