package com.shreehans.fabrication.repository;

import com.shreehans.fabrication.entity.Enquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EnquiryRepository extends JpaRepository<Enquiry,Long> {

}
