package com.atosdigitalacademy.macantine.service;

import com.atosdigitalacademy.macantine.models.Plat;
import com.atosdigitalacademy.macantine.service.dtos.PlatDTO;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface PlatService {
    PlatDTO save(PlatDTO platDTO);
    PlatDTO update(PlatDTO platDTO);
    Optional <PlatDTO> findOne(Long id);
    List<PlatDTO> findAll();
    void delete(Long id);


}
