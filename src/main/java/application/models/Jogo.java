package application.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;
import java.util.HashSet;
import javax.persistence.JoinTable;

@Entity
@Table(name="jogos")

public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;

    @ManyToMany(mappedBy = "id_genero")
    private Genero genero;

    @ManyToMany
    @JoinTable(
        name = "jogos_possuem_plataformas",
        joinColumns = @JoinColumn(name = "jogos_id"),
        inverseJoinColumns=@JoinColumn(name="plataforma_id"))
    
    private Set<Plataforma> plataformas = new HashSet<>();  


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public Set<Plataforma> getPlataforma() {
        return plataformas;
    }
    public void setPlataforma(Set<Plataforma> plataforma) {
        this.plataformas = plataforma;
    }
    
}
