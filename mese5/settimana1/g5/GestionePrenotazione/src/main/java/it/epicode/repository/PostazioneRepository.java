package it.epicode.repository;

import it.epicode.entities.Postazioni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazioni,Long> {
}