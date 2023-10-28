package com.dpc.dto;

import com.dpc.entities.Namespaces;
import com.dpc.entities.Zone;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NameSpaceResponseDTO {
    private Long id;
    private String namespace;



    private Long znameId;
}
