package com.dpc.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity(name = "namespaces")
@NoArgsConstructor
public class Namespaces {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String namespace;



    private Long znameId;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    @JoinColumn(name= "znameId", updatable = false, insertable = false)
    private Zone zone;
}
