package com.nunsys.bootcamp.JPAprueba.webrest;

import com.nunsys.bootcamp.JPAprueba.Repository.PocionRepository;
import com.nunsys.bootcamp.JPAprueba.domain.Pocion;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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
}