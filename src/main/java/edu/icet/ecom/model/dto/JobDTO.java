package edu.icet.ecom.model.dto;

import lombok.*;

@Getter
@Setter
@ToString
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
