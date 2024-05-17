package it.epicode.services;

import it.epicode.entities.Postazioni;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.epicode.repository.PostazioneRepository;
@Service
public class PostazioneService {
    @Autowired
    PostazioneRepository postazioneRepository;

    public void save(Postazioni postazioni){
        postazioneRepository.save(postazioni);
    }

}
