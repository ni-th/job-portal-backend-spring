package edu.icet.ecom.repository;

import edu.icet.ecom.model.entity.JobEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobEntity, Integer> {

}
