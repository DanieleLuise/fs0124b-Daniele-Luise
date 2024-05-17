package it.epicode.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.epicode.repository.PrenotazioneRepository;
@Service
public class PrenotazioneService {
    @Autowired
    PrenotazioneRepository prenotazioneRepository;
}
