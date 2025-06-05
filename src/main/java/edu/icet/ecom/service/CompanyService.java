package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.CompanyDTO;
import edu.icet.ecom.model.entity.CompanyEntity;
import edu.icet.ecom.repository.CompanyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    @Autowired
    CompanyRepository companyRepository;
    public void add(CompanyDTO companyDTO) {
        CompanyEntity companyEntity = new ModelMapper().map(companyDTO,CompanyEntity.class);
        companyRepository.save(companyEntity);
    }
    public CompanyDTO get(){
        return new CompanyDTO(1,"Panadura","MAS","Clothing");
    }
}
