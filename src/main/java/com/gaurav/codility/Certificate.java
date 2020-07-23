package com.gaurav.codility;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name ="Certificate")
class Certificate{
	
	
	@Id
    @GeneratedValue
    @Column(name = "id")
	private int id;
	
	@Column(name = "certificateName", nullable = false)
	private String certificateName;
	
	@ManyToOne
    @JoinColumn(name = "rollNo")
	private Student student;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	
	public Certificate(int id, String certificateName) {
		super();
		this.id = id;
		this.certificateName = certificateName;
	}
	
	public Certificate() {
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
