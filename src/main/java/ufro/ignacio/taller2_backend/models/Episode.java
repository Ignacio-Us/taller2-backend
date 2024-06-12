package ufro.ignacio.taller2_backend.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "episode")
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "air_date", nullable = false, length = 45)
    private String air_date;

    @Column(name = "episode", nullable = false, length =  45)
    private String episode;

    @Column(name = "characters", nullable = false, length = 100)
    private String characters;

    @Column(name = "created", nullable = false, length = 100)
    private String created;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "url", nullable = false, length = 100)
    private String url;

    @ManyToMany(mappedBy = "episodes")
    private Set<Characters> characters2;
}