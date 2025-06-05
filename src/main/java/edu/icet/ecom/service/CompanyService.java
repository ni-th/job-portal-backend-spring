package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.CompanyDTO;
import edu.icet.ecom.model.dto.JobDTO;
import edu.icet.ecom.model.entity.CompanyEntity;
import edu.icet.ecom.repository.CompanyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyService {
    @Autowired
    CompanyRepository companyRepository;
    public void add(CompanyDTO companyDTO) {
        CompanyEntity companyEntity = new ModelMapper().map(companyDTO,CompanyEntity.class);
        companyRepository.save(companyEntity);
    }
    public List<CompanyDTO> getAll(){
        List<CompanyEntity> all = companyRepository.findAll();
        List<CompanyDTO> collect = all.stream()
                .map(companyEntity -> new ModelMapper().map(companyEntity, CompanyDTO.class))
                .collect(Collectors.toList());
        return collect;
    }
    public void delete(Integer id){
        companyRepository.deleteById(id);
    }
    public void update(CompanyDTO companyDTO){
        companyRepository.save(new ModelMapper().map(companyDTO, CompanyEntity.class));
    }
}
