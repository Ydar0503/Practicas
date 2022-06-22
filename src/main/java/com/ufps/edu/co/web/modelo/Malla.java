package com.ufps.edu.co.web.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
@Entity
@Table(name = "mallas")
public class Malla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_codigo")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private ItemCurricular item;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Usuario usuario;
}
