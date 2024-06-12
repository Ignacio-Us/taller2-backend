package ufro.ignacio.taller2_backend.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "location")
public class Location {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "dimension", nullable = false)
    private Integer dimension;

    @Column(name = "created", nullable = false, length = 45)
    private String created;

    @Column(name = "type", nullable = false, length = 45)
    private String type;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "residents_length", nullable = false, length = 100)
    private String residents_length;

    @Column(name = "url", nullable = false, length = 100)
    private String url;

    @OneToMany(mappedBy = "location")
    private Set<Characters> characters;
}
