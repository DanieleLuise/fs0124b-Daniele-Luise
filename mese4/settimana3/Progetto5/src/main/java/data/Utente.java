package data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import javax.xml.crypto.Data;

@Entity

public class Utente {
    @Id
    @GeneratedValue

    private long id;
    private String nome;
    private String cognome;
    private Data dataNascita;
    private long numeroTelefonico;


    public Utente() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Data getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Data dataNascita) {
        this.dataNascita = dataNascita;
    }

    public long getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(long numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                ", numeroTelefonico=" + numeroTelefonico +
                '}';
    }
}

