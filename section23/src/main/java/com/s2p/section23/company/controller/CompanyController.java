package com.s2p.section23.company.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies")
public class CompanyController
{
    // GET http://localhost:8080/api/companies
    // header application/vnd.S2PJobPortal+json
    @GetMapping(
            version = "1.0"
    )
    public ResponseEntity<String> getAllCompanies()
    {
        return ResponseEntity.ok().body("Companies List");
    }
}
