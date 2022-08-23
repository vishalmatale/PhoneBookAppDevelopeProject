package com.BikkadIT.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.Entity.Contact;
@Repository
public interface ContactRepositery extends JpaRepository<Contact, Integer> {

}
