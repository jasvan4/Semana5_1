package com.example.semana5_1;

public class Contactos {
    private int id;
    private String nombre;
    private String telefono;
    private String email;
    private int foto;
    private int likes;
    
   
    
    public Contactos ( int likes ) {
        this.likes = likes;
    }
    
    public Contactos ( String nombre, String telefono, String email, int foto) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.foto = foto;

    }
    
    public Contactos () { }
    
    public int getId () {return id; }
    public void setId ( int id ) { this.id = id;  }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre ( String nombre ) {
        this.nombre = nombre;
    }
    
    public void setTelefono ( String telefono ) {this.telefono = telefono; }
    public String getTelefono() {
        return telefono;
    }
    
    public void setEmail ( String email ) { this.email = email;  }
    public String getEmail() {
        return email;
    }
    
    public void setFoto ( int foto ) { this.foto = foto;   }
    public int getFoto() {
        return foto;
    }
    
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    
    
}// fin clas contactos
