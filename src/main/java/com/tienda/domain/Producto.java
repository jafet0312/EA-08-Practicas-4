/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
//import java.util.List;
import lombok.Data;

/**
 *
 * @author jafet
 */
@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private long idProducto;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    private long idCategoria;
    private String detalle;
    private int existencias;
    private double precio;
    
    //@OneToMany
//@JoinColumn(name="id_categoria",updatable=false)
//List<Producto> productos;


    public Producto() {
    }

    public Producto(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

}
