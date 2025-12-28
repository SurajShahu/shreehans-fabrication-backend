package com.shreehans.fabrication.controller;

import com.shreehans.fabrication.form.EnquiryForm;
import com.shreehans.fabrication.entity.Enquiry;
import com.shreehans.fabrication.service.EnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "https://shreehansfabrication.netlify.app")
@RestController
@RequestMapping("/api")
public class EnquiryController {
    @Autowired
    private EnquiryService service;

    @PostMapping("/enquiry")
    public ResponseEntity<?> createEnquiry(@Valid @RequestBody EnquiryForm dto) {
        return ResponseEntity.ok(service.saveEnquiry(dto));
    }

    @GetMapping("/enquiries")
    public List<Enquiry> getAll() {
        return service.getAllEnquiries();
    }

}
