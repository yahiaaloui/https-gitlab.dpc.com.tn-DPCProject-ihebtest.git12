package com.dpc.service;

import com.dpc.dto.ZoneRequestDTO;
import com.dpc.dto.ZoneResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ZoneService {
    List<ZoneResponseDTO> findAllZone();

    ZoneResponseDTO getZoneById(Long id);

    ZoneResponseDTO addZone(ZoneRequestDTO dto);
}
