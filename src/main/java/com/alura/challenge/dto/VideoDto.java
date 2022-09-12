package com.alura.challenge.dto;//sai informações para o cliente

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.alura.challenge.entities.Video;

public class VideoDto {
	private Long videoId;
	private String titulo;
	private String descricao;
	private String url;
	
	public VideoDto(Video video) {
		this.videoId = video.getvideoId();
		this.titulo = video.getTitulo();
		this.descricao = video.getDescricao();
		this.url = video.getUrl();
		
	}
	
	public Long getVideoId() {
		return videoId;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getUrl() {
		return url;
	}

	public static List<VideoDto> converter(List<Video> videos) {
		
		return videos.stream().map(VideoDto::new).collect(Collectors.toList());
	}

	public static List<VideoDto> converter(Optional<Video> videoPorId) {
		
		return videoPorId.stream().map(VideoDto::new).collect(Collectors.toList());
	}
	
	
	
	
	
}
