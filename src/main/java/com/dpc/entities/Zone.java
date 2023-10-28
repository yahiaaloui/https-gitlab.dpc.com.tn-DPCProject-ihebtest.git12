package com.dpc.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;

@Data
@Entity(name = "zone")
@NoArgsConstructor
public class Zone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String zname;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "zone", cascade = CascadeType.ALL)
    private List<Namespaces> namespaces;





}
