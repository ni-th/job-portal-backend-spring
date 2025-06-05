package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.CompanyDTO;
import edu.icet.ecom.model.dto.JobDTO;
import edu.icet.ecom.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @PostMapping("register")
    public void add(@RequestBody CompanyDTO companyDTO){
        companyService.add(companyDTO);
        System.out.println("Company Added Succesfully");
    }
    @GetMapping("/all-companies")
    public List<CompanyDTO> getAll(){
        return companyService.getAll();
    }
    @DeleteMapping("delete-company/{id}")
    public void delete( @PathVariable Integer id){
        companyService.delete(id);
    }
    @PutMapping("/update-company")
    public void update(@RequestBody CompanyDTO companyDTO){
        companyService.update(companyDTO);
    }


}
