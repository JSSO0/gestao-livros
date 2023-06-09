package com.devmedia.mvc.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "livro")
public class Livro {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id; 
	
	@Column(name="titulo", nullable=false)
	private String titulo; 

	@Column(name="isbn", nullable=false, unique=true)
	private String isbn; 
	
	@Column(name="autor", nullable=false)
	private String autor;
	
	@Column(name="descricao", nullable=true)
	private String descricao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}

/* 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Entity
public class Livro {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id; 
	
	@Column(name="titulo", nullable=false)
	private String titulo; 

	@Column(name="titulo", nullable=false, unique=true)
	private String isbn; 
	

	@Column(name="autor", nullable=false)
	private String autor;
	
	@Column(name="titulo", nullable=true)
	private String description;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}*/