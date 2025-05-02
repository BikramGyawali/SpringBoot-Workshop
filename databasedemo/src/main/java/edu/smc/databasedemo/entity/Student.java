package edu.smc.databasedemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  // this class represents my table
@Table(name="student")  //connect with student table
public class Student {
	@Id  // denotes the id as primary key
	
@GeneratedValue (strategy = GenerationType.IDENTITY) // for auto increment 
 public int id ;
 public String name;
 public int age ;
 
 @Column (name="program")  // connect with program column of database table
 public String Program;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public String getProgram() {
	return program;
}
public void setProgram(String program) {
	this.program = program;
}
 
public Student(int id, String name, int age, String program) {
	
	this.id = id;
	this.name = name;
	this.age = age;
	
	this.program = program;
}
public Student() {
	
}
public Student(String name, int age, String program) {
//	super();  remove super because constructor always call for first time
	this.name = name;
	this.age = age;
	this.program = program;
} 
  	
}
