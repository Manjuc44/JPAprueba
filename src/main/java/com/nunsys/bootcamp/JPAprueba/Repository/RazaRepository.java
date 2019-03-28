package com.nunsys.bootcamp.JPAprueba.Repository;

import com.nunsys.bootcamp.JPAprueba.domain.Raza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RazaRepository extends JpaRepository<Raza, Long> {
        List<Raza> findAllByOrderByNombreAsc();
        }
