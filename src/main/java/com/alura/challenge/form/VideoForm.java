package com.alura.challenge.form; //recebendo informação do cliente

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.alura.challenge.entities.Video;

public class VideoForm {
	
	@NotNull @NotEmpty
	private String titulo;
	
	@NotNull @NotEmpty
	private String descricao;
	
	@NotNull @NotEmpty
	private String url;

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

	public Video converter() {
		return new Video(titulo, descricao, url);
	}

}
