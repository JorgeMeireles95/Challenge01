package com.alura.challenge.form; //recebendo informação do cliente

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.alura.challenge.entities.Video;

public class VideoForm {
	@NotBlank
	@NotEmpty
	private String titulo;
	@NotBlank
	@NotEmpty
	private String descricao;
	@NotBlank
	@NotEmpty
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
