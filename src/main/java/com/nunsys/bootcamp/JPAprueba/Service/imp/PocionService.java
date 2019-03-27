
package com.nunsys.bootcamp.JPAprueba.Service.imp;


import com.nunsys.bootcamp.JPAprueba.Repository.PocionRepository;
import com.nunsys.bootcamp.JPAprueba.Service.IPocionService;
import com.nunsys.bootcamp.JPAprueba.domain.Pocion;

import java.util.List;
import java.util.Optional;

public class PocionService implements IPocionService {

    private PocionRepository pocionRepository;

    public PocionService(PocionRepository pocionRepository){
        this.pocionRepository = pocionRepository;
    }

    @Override
    public List<Pocion> findAll() {
        return this.pocionRepository.findAll();
    }

    @Override
    public List<Pocion> findByEsEpica() {
        return this.pocionRepository.findByEsEpica(true);
    }

    @Override
    public void delete(Pocion pocion) {
        this.pocionRepository.delete(pocion);
    }

    @Override
    public Pocion save(Pocion pocion) {
        return this.pocionRepository.save(pocion);
    }

    @Override
    public Optional<Pocion> findById(Long id) {
        return this.findById(id);
    }
}
