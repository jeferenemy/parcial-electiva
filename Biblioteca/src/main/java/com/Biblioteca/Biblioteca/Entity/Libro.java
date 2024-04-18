package com.Biblioteca.Biblioteca.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libro extends ABaseEntity{

    @Column(name = "titulo", length = 50, nullable = false)
    private String titulo;

    @Column(name = "autor", length = 50, nullable = false)
    private String autor;

    @Column(name = "anioPublicacion", nullable = false)
    private int anioPublicacion;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Libro() {
        
    }
}
