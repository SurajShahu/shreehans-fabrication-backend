package com.shreehans.fabrication.service;

import com.shreehans.fabrication.form.EnquiryForm;
import com.shreehans.fabrication.entity.Enquiry;
import com.shreehans.fabrication.repository.EnquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EnquiryService {
    @Autowired
    private EnquiryRepository repository;

    public Enquiry saveEnquiry(EnquiryForm dto) {
        Enquiry enquiry = new Enquiry();
        enquiry.setName(dto.getName());
        enquiry.setMobile(dto.getMobile());
        enquiry.setServiceType(dto.getServiceType());
        enquiry.setMessage(dto.getMessage());
        enquiry.setCreatedAt(LocalDateTime.now());

        return repository.save(enquiry);
    }

    public List<Enquiry> getAllEnquiries() {
        return repository.findAll();
    }

}
