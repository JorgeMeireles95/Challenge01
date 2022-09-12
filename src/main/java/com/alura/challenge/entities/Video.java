package com.alura.challenge.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name = "tb_videos")
public class Video {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long videoId;

	private String titulo;

	private String descricao;
	private String url;

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
