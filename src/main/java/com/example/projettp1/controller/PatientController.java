package com.example.projettp1.controller;

import org.springframework.web.bind.annotation.*;


@RequestMapping("/api")
@RestController
public class PatientController {

    @GetMapping
    public String home() {
    
        return "MARLYATOU DIALLO votre VM marche correctement ";
    }

}