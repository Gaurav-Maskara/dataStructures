package com.gaurav.LnD;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
class Student{
	
	@Id
    @GeneratedValue
    @Column(name = "id")
	private int id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "rollNo", nullable = false)
	private int rollNo;
	
	@Column(name = "age", nullable = false)
	private int age;
	
	@Column(name = "marks", nullable = false)
	private double marks;
	
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private Set<Certificate> certificates;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getMarks() {
		return marks;
	}
	
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public Student(String name, int rollNo, int age, double marks) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.marks = marks;
	}
	
	public Student() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(Set<Certificate> certificates) {
		this.certificates = certificates;
	}
}