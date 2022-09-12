package com.alura.challenge.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.alura.challenge.dto.VideoDto;
import com.alura.challenge.entities.Video;
import com.alura.challenge.form.VideoForm;
import com.alura.challenge.repositories.VideoRepository;

@RestController
@RequestMapping("/videos")
public class VideoController {

	@Autowired
	private VideoRepository videoRepository;

	@PostMapping
	public ResponseEntity<VideoDto> cadastrar(@RequestBody @Valid VideoForm form,UriComponentsBuilder uriBuilder) {
		Video video = form.converter();
		videoRepository.save(video);
		URI uri = uriBuilder.path("/videos/{id}").buildAndExpand(video.getvideoId()).toUri();
		return ResponseEntity.created(uri).body(new VideoDto(video));

	}

	@GetMapping
	public List<VideoDto> lista() {
		List<Video> videos = videoRepository.findAll();
		return VideoDto.converter(videos);
	}

	
	
	
	@GetMapping("/{id}")
	public VideoDto unicoElemento(@PathVariable("id") Long id){
		Video video = videoRepository.getById(id);
		
		return new VideoDto(video);
	}


}
