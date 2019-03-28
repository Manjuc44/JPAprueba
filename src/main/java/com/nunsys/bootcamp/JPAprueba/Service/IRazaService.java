package com.nunsys.bootcamp.JPAprueba.Service;

import com.nunsys.bootcamp.JPAprueba.domain.Pocion;
import com.nunsys.bootcamp.JPAprueba.domain.Raza;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IRazaService {

    public List<Raza> findAll();
    public void delete(Long id);
    public Raza save(Raza raza);
    public Optional<Raza> findById(Long id);
}
