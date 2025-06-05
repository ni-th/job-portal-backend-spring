package edu.icet.ecom.repository;

import edu.icet.ecom.model.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer> {

}
