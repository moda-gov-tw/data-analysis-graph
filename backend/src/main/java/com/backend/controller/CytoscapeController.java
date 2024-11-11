package com.backend.controller;

import com.backend.service.CytoscapeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CytoscapeController {

    @Autowired
    CytoscapeService cytoscapeService;

    @GetMapping("/companydata")
    public ResponseEntity<String> getCompanyData() {
        String result = cytoscapeService.getCompanyData();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/socialdata")
    public ResponseEntity<String> getSocialData() {
        String result = cytoscapeService.getSocialData();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getdata")
    public ResponseEntity<String> getData() {
        String result = cytoscapeService.getData();
        return ResponseEntity.ok(result);
    }

}
