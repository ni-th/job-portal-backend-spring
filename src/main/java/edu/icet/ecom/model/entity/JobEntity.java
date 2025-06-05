package edu.icet.ecom.model.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job")
public class JobEntity {
    @Id
    private Integer job_id;
    private String salary_date;
    private Double salary;
    private String description;
    private String title;
    private Integer company_id;
}
