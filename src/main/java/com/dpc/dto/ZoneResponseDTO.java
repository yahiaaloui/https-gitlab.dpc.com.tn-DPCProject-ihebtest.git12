package com.dpc.dto;

import antlr.NameSpace;
import com.dpc.entities.Namespaces;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZoneResponseDTO {
    private Long id;
    private String zname;

    private List<Namespaces> namespaces;
}
