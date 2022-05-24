package application.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name="jogos")

public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    @OneToMany(mappedBy = "jogos")
    private Set<Jogo> jogos = new HashSet<>();


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set<Jogo> getJogos() {
        return jogos;
    }
    public void setJogos(Set<Jogo> jogos) {
        this.jogos = jogos;
    }
    
}
