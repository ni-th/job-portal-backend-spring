package edu.icet.ecom.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDTO {
    private Integer company_id;
    private String location;
    private String name;
    private String industry;
}
