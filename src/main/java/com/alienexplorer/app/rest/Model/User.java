package com.alienexplorer.app.rest.Model;

import jakarta.persistence.*;


@Entity
@Table(schema = "usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String identificacion;
    @Column
    private String nombre;
    @Column
    private String email;
    @Column
    private String telefono;

    public long getId(){
        return id;
    }
    public void setID(long id){
        this.id = id;
    }

    public String getIdentificacion(){
        return identificacion;
    }
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
}
