package com.dpc.mappers;

import com.dpc.dto.ZoneRequestDTO;
import com.dpc.dto.ZoneResponseDTO;
import com.dpc.entities.Zone;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ZoneMapper {
    ZoneResponseDTO zoneToZoneResponseDTO(Zone zone);
    Zone zoneRequestDTOToZone(ZoneRequestDTO zoneRequestDTO);


}
