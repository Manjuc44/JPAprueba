package com.nunsys.bootcamp.JPAprueba.webrest;

import com.nunsys.bootcamp.JPAprueba.Repository.PocionRepository;
import com.nunsys.bootcamp.JPAprueba.Service.IPocionService;
import com.nunsys.bootcamp.JPAprueba.Service.imp.PocionService;
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
    private IPocionService pocionService;

    public PocionResource(IPocionService pocionService){
        this.pocionService=pocionService;
    }

    @GetMapping("/pociones")
    public List<Pocion> getPociones() {
        List<Pocion> potis= pocionService.findAll();
        return potis;
    }

    @PostMapping("/pociones")
    public void insertPotion(@RequestBody Pocion pocion) {
        this.pocionService.save(pocion);
    }

    @GetMapping("/pociones/{id}")
    public Optional<Pocion> getPotion(@PathVariable Long id) {
        Optional<Pocion> poti= this.pocionService.findById(id);
        return poti;
    }

    @PutMapping("/pociones")
    public Pocion updatePocion(@RequestBody Pocion pocion){
        return this.pocionService.save(pocion);
    }
    /*
    ¿Como se escribe Sintaxis?
    -Con uber
     */
    @DeleteMapping("/pociones")
    public void deletePocion(@RequestBody Pocion pocion){
         this.pocionService.delete(pocion);
    }
    @GetMapping("/pociones/obtenerEpicas")
    public List<Pocion> getEpicas(){
        return this.pocionService.findByEsEpica();
    }
    @GetMapping("/pociones/OrdenarPorNombre")
    public List<Pocion> getByOrden(){
        return  this.pocionService.findAllByOrderByDescripcionDesc();
    }
}