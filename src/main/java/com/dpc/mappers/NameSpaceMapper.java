package com.dpc.mappers;

import com.dpc.dto.NameSpaceRequestDTO;
import com.dpc.dto.NameSpaceResponseDTO;
import com.dpc.dto.ZoneRequestDTO;
import com.dpc.dto.ZoneResponseDTO;
import com.dpc.entities.Namespaces;
import com.dpc.entities.Zone;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NameSpaceMapper {
    NameSpaceResponseDTO namespacesToNameSpaceResponseDTO(Namespaces namespaces);
    Namespaces namespacesRequestDTOToNamespaces(NameSpaceRequestDTO nameSpaceRequestDTO);


}
