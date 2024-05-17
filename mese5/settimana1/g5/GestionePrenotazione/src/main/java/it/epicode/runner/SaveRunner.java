package it.epicode.runner;

import it.epicode.entities.AppConfig;
import it.epicode.entities.Edificio;
import it.epicode.entities.Postazioni;
import it.epicode.entities.Utente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.stereotype.Component;
import it.epicode.services.EdificioService;
import it.epicode.services.PostazioneService;
import it.epicode.services.PrenotazioneService;
import it.epicode.services.UtenteService;
@Component
@Slf4j
public class SaveRunner implements CommandLineRunner {
    @Autowired
    private EdificioService edificioService;
    @Autowired
    private PostazioneService postazioneService;
    @Autowired
    private PrenotazioneService prenotazioneService;
    @Autowired
    private UtenteService utenteService;



    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        utenteService.save(ctx.getBean("Dany", Utente.class));
        utenteService.save(ctx.getBean("Jo",Utente.class));
        utenteService.save(ctx.getBean("Carlo",Utente.class));

        edificioService.save(ctx.getBean("EdificioEst", Edificio.class));
        edificioService.save(ctx.getBean("EdificioOvest", Edificio.class));

        postazioneService.save(ctx.getBean("postazione1", Postazioni.class));
        postazioneService.save(ctx.getBean("postazione2", Postazioni.class));


    }

}
