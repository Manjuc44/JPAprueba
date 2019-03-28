package com.nunsys.bootcamp.JPAprueba.webrest;

import com.nunsys.bootcamp.JPAprueba.Service.IRazaService;
import com.nunsys.bootcamp.JPAprueba.domain.Raza;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class RazaResource {
    private IRazaService razaService;

    public RazaResource(IRazaService razaService){
        this.razaService= razaService;
    }

    @GetMapping("/razas")
    public List<Raza> getRazas(){
        List<Raza> razas= this.razaService.findAll();
        return razas;
    }

    @GetMapping("/razas/{id}")
    public Optional<Raza> getRaza(@PathVariable Long id){
        Optional<Raza> raza=this.razaService.findById(id);
        return raza;
    }

    @PostMapping("/razas")
    public void crearRaza(@RequestBody Raza raza){
        this.razaService.save(raza);
    }

    @PutMapping("/razas")
    public void updateRaza(@RequestBody Raza raza){
        this.razaService.save(raza);
    }
    @DeleteMapping("/razas/{id}")
    public void deleteRaza(@PathVariable Long id){
        this.razaService.delete(id);
    }

}

