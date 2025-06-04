package edu.icet.ecom.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyEntity {
    private Integer company_id;
    private String location;
    private String name;
    private String industry;
}
