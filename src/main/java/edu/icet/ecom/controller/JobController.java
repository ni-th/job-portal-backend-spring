package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.JobDTO;
import edu.icet.ecom.model.entity.JobEntity;
import edu.icet.ecom.service.JobService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    @PostMapping("/add-job")
    public void add(@RequestBody JobDTO jobDTO){
        System.out.println(jobDTO);
        jobService.add(jobDTO);
    }
    @GetMapping("/all-jobs")
    public List<JobDTO> getAll(){
        return jobService.getAll();
    }
    @DeleteMapping("/delete-job/{id}")
    public void delete(@PathVariable Integer id){
        jobService.delete(id);
    }
    @PutMapping("/update-job")
    public void update(@RequestBody JobDTO jobDTO){
        jobService.update(jobDTO);
    }
}
