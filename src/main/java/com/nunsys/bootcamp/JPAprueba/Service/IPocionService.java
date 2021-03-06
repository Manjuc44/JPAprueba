package com.nunsys.bootcamp.JPAprueba.Service;

import com.nunsys.bootcamp.JPAprueba.domain.Pocion;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface IPocionService {

    public List<Pocion> findAll();
    public List<Pocion> findByEsEpica();
    public void delete(Long id);
    public Pocion save(Pocion pocion);
    public Optional<Pocion> findById(Long id);
    public List<Pocion> findAllByOrderByDescripcionDesc();
}
