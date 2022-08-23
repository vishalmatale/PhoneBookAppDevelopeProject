package com.BikkadIT.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
@Entity
@Data
@Table(name = "TABLE_CONTACT")
public class Contact {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "CONTACT_ID")
	private int contactId;
  
  @Column(name = "CONTACT_NAME")
	private String contactName;
  
  @Column(name = "CONTACT_NUMBER")
	private long contactNumber;
  
  @Column(name = "ACTIVE_SWITCH")
	private Character activeSwitch;
  
  @Column(name = "CREATE_DATE")
  @CreationTimestamp
	private LocalDate CreatedDate;
  
  @Column(name = "UPDATE_DATE")
  @UpdateTimestamp
	private LocalDate updDate;
	
	
	
}
