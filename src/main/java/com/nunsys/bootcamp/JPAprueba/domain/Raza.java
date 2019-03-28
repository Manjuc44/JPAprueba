package com.nunsys.bootcamp.JPAprueba.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "raza")
public class Raza implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "bando")
    private Bando bando;

    @Column(name = "estrellas")
    private int estrellas;

    @Size(min=0, max=2000000)
    @Column(name = "imagen")
    private String imagen;


    public Raza() {
    }

    public Raza(String nombre, String descripcion, Bando bando, int estrellas, @Size(min = 0, max = 2000000) String imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.bando = bando;
        this.estrellas = estrellas;
        this.imagen = imagen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Bando getBando() {
        return bando;
    }

    public void setBando(Bando bando) {
        this.bando = bando;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}

