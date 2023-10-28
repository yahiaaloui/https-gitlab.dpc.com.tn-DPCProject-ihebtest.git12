package com.dpc.service;


import com.dpc.dto.NameSpaceRequestDTO;
import com.dpc.dto.NameSpaceResponseDTO;
import com.dpc.dto.ZoneRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface NameSpaceService {
    List<NameSpaceResponseDTO> findAllZone();

    NameSpaceResponseDTO getNameSpaceById(Long id);

    NameSpaceResponseDTO addNameSpace(NameSpaceRequestDTO dto);
}
