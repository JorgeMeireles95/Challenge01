package com.alura.challenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alura.challenge.entities.Video;

public interface VideoRepository extends JpaRepository<Video, Long> {

}
