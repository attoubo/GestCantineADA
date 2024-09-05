package com.atosdigitalacademy.macantine.Repository;

import com.atosdigitalacademy.macantine.models.Menu;
import com.atosdigitalacademy.macantine.service.dtos.MenuDTO;
import com.atosdigitalacademy.macantine.service.dtos.PlatDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

}
