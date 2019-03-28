
package com.nunsys.bootcamp.JPAprueba.Service.imp;


import com.nunsys.bootcamp.JPAprueba.Repository.PocionRepository;
import com.nunsys.bootcamp.JPAprueba.Service.IPocionService;
import com.nunsys.bootcamp.JPAprueba.domain.Pocion;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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
    public void delete(Long id) {
        Pocion pocion = this.pocionRepository.findById(id).get();
        this.pocionRepository.delete(pocion);
    }

    @Override
    public Pocion save(Pocion pocion) {
        return this.pocionRepository.save(pocion);
    }

    @Override
    public Optional<Pocion> findById(Long id) {
        return this.pocionRepository.findById(id);
    }

    @Override
    public List<Pocion> findAllByOrderByDescripcionDesc() {
        return null;
    }
}
