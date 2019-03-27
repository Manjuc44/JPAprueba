package com.nunsys.bootcamp.JPAprueba.webrest;

import com.nunsys.bootcamp.JPAprueba.Repository.PocionRepository;
import com.nunsys.bootcamp.JPAprueba.domain.Pocion;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*
 ¿que le dice una gallina a otra? Necesitamos apoyo.

 */

@RestController
@RequestMapping("/api")

public class PocionResource {
    private PocionRepository repositoryPoti;

    public PocionResource(PocionRepository repositoryPoti){
        this.repositoryPoti=repositoryPoti;
    }

    @GetMapping("/pociones")
    public List<Pocion> getPociones() {
        List<Pocion> potis= repositoryPoti.findAll();
        return potis;
    }

    @PostMapping("/pociones")
    public void insertPotion(@RequestBody Pocion pocion) {
        this.repositoryPoti.save(pocion);
    }

    @GetMapping("/pociones/{id}")
    public Optional<Pocion> getPotion(@PathVariable Long id) {
        Optional<Pocion> poti= this.repositoryPoti.findById(id);
        return poti;
    }

    @PutMapping("/pociones")
    public Pocion updatePocion(@RequestBody Pocion pocion){
        return this.repositoryPoti.save(pocion);
    }
    /*
    ¿Como se escribe Sintaxis?
    -Con uber
     */
    @DeleteMapping("/pociones")
    public void deletePocion(@RequestBody Pocion pocion){
         this.repositoryPoti.delete(pocion);
    }
    @GetMapping("/pociones/obtenerEpicas")
    public List<Pocion> getEpicas(){
        return this.repositoryPoti.findByEsEpica(true);
    }
    @GetMapping("/pociones/OrdenarPorNombre")
    public List<Pocion> getByOrden(){
        return  this.repositoryPoti.findAllByOrderByDescripcionDesc();

    }
}