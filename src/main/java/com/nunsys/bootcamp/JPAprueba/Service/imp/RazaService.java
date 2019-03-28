package com.nunsys.bootcamp.JPAprueba.Service.imp;

import com.nunsys.bootcamp.JPAprueba.Repository.RazaRepository;
import com.nunsys.bootcamp.JPAprueba.Service.IRazaService;
import com.nunsys.bootcamp.JPAprueba.domain.Raza;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RazaService implements IRazaService {
    private RazaRepository razaRepository;

    public RazaService(RazaRepository razaRepository){
        this.razaRepository = razaRepository;
    }

    @Override
    public List<Raza> findAll() {
        return this.razaRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Raza raza= this.razaRepository.findById(id).get();
         this.razaRepository.delete(raza);
    }

    @Override
    public Raza save(Raza raza) {
       return this.razaRepository.save(raza);
    }

    @Override
    public Optional<Raza> findById(Long id) {
        return this.razaRepository.findById(id);
    }
}
