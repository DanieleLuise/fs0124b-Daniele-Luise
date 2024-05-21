package it.epicode.Esercizio2.services;

import it.epicode.Esercizio2.entities.Autore;
import it.epicode.Esercizio2.repositories.AutoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoreService {
    @Autowired
    private AutoreRepository autore;


    public Optional<Autore> save(Autore a) {
        return Optional.of(autore.save(a));
    }

    public List<Autore> getAll(){return autore.findAll();}


}
