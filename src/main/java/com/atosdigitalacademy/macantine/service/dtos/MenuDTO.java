package com.atosdigitalacademy.macantine.service.dtos;

import com.atosdigitalacademy.macantine.models.Plat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class MenuDTO {
    private Long id;
    private LocalDate creationDate;
    private List<Plat> plat;
}
