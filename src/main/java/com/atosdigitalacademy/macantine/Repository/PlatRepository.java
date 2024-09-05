package com.atosdigitalacademy.macantine.Repository;

import com.atosdigitalacademy.macantine.models.Plat;
import com.atosdigitalacademy.macantine.service.dtos.MenuDTO;
import com.atosdigitalacademy.macantine.service.dtos.PlatDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlatRepository extends JpaRepository<Plat, Long> {
    Optional<PlatDTO> findByName(String name);

}
