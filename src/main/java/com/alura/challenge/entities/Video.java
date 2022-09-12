package com.alura.challenge.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "tb_videos")
public class Video {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long videoId;

	@NotEmpty
	private String titulo;
	@NotEmpty
	private String descricao;
	@NotEmpty
	private String url;
	
	
	
	public Video(String titulo, String descricao, String url) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.url = url;
	}

	public Video() {
		// TODO Auto-generated constructor stub
	}

	public Long getvideoId() {
		return videoId;
	}

	public void setvideoId(Long id) {
		this.videoId = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
