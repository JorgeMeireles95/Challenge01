package com.alura.challenge.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.alura.challenge.entities.Video;
import com.alura.challenge.repositories.VideoRepository;

public class AtualizacaoVideoForm {

	
	@NotNull @NotEmpty
	private String titulo;
	
	@NotNull @NotEmpty
	private String descricao;
	
	@NotNull @NotEmpty
	private String url;

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getUrl() {
		return url;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Video atualizar(Long id, VideoRepository videoRepository) {
		Video video = videoRepository.getOne(id);
		video.setTitulo(this.titulo);
		video.setDescricao(this.descricao);
		video.setUrl(this.url);
		return video;
	}
	
	
	
}
