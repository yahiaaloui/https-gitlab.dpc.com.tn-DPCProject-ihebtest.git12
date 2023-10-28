package com.dpc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NameSpaceRequestDTO {
    private Long id;
    private String namespace;



    private Long znameId;
}
