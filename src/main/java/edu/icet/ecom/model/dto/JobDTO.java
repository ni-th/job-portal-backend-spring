package edu.icet.ecom.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobDTO {
    private Integer job_id;
    private String salary_date;
    private Double salary;
    private String description;
    private String title;
    private Integer company_id;
}
