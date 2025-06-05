package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.CompanyDTO;
import edu.icet.ecom.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @PostMapping("register")
    public void add(@RequestBody CompanyDTO companyDTO){
        companyService.add(companyDTO);
        System.out.println("Company Added Succesfully");
    }
    @GetMapping
    public CompanyDTO get(){
        return companyService.get();
    }

}
