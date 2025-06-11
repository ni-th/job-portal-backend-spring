package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.CompanyDTO;
import edu.icet.ecom.model.dto.JobDTO;
import edu.icet.ecom.model.entity.CompanyEntity;
import edu.icet.ecom.model.entity.JobEntity;
import edu.icet.ecom.repository.CompanyRepository;
import edu.icet.ecom.repository.JobRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobService {
    @Autowired
    JobRepository jobRepository;
    @Autowired
    CompanyRepository companyRepository;
    private final ModelMapper modelMapper = new ModelMapper();
    public void add(JobDTO jobDTO){

        JobEntity jobEntity = modelMapper.map(jobDTO, JobEntity.class);
        CompanyEntity company = companyRepository.findById(jobDTO.getCompany_id())
                .orElseThrow(() -> new RuntimeException("Company not found"));

        jobEntity.setCompanyEntity(company);

        jobRepository.save(jobEntity);
    }
    public List<JobDTO> getAll(){
        List<JobEntity> all = jobRepository.findAll();
        List<JobDTO> collect = all.stream()
                .map(jobEntity -> new ModelMapper().map(jobEntity, JobDTO.class))
                .collect(Collectors.toList());
        return collect;
    }
    public void delete(Integer id){
        jobRepository.deleteById(id);
    }
    public void update(JobDTO jobDTO){
        JobEntity jobEntity = modelMapper.map(jobDTO, JobEntity.class);
        CompanyEntity company = companyRepository.findById(jobDTO.getCompany_id())
                .orElseThrow(() -> new RuntimeException("Company not found"));

        jobEntity.setCompanyEntity(company);

        jobRepository.save(jobEntity);
    }
}
