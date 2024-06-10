package com.example.demo.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Employe {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private String dept;
	
	private Date dob;
	
	private double salary;
	
	
	@CreatedDate
	private long createDate;
	
	@LastModifiedBy
	private long modifieddate;
	
	@CreatedBy
	private String cretedBy;
	
	@LastModifiedBy
	private String modifyedby;
	
	
	

}
