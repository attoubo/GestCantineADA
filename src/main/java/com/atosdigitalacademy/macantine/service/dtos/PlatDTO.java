package com.atosdigitalacademy.macantine.service.dtos;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PlatDTO {
    private Long id;
    private String name;
    private String summary;

}
