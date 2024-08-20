package brianpelinku.entities;

import brianpelinku.enums.TipoEvento;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "eventi")
public class Evento {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String titolo;
    @Column(nullable = false)
    private Date dataEvento;
    @Column(nullable = false)
    private String descrizione;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;
    @Column(nullable = false)
    private int numMaxPartecipanti;

    public Evento() {
    }

    public Evento(String titolo, Date dataEvento, String descrizione, TipoEvento tipoEvento, int numMaxPartecipanti) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numMaxPartecipanti = numMaxPartecipanti;
    }

    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumMaxPartecipanti() {
        return numMaxPartecipanti;
    }

    public void setNumMaxPartecipanti(int numMaxPartecipanti) {
        this.numMaxPartecipanti = numMaxPartecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numMaxPartecipanti=" + numMaxPartecipanti +
                '}';
    }
}
