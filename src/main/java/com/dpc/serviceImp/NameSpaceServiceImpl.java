package com.dpc.serviceImp;

import com.dpc.dto.NameSpaceRequestDTO;
import com.dpc.dto.NameSpaceResponseDTO;
import com.dpc.dto.ZoneRequestDTO;
import com.dpc.entities.Namespaces;
import com.dpc.exceptions.ResourceNotFoundException;
import com.dpc.mappers.NameSpaceMapper;
import com.dpc.repository.NameSpaceRepository;
import com.dpc.service.NameSpaceService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NameSpaceServiceImpl implements NameSpaceService {
    private final NameSpaceRepository nameSpaceRepository;
    private final NameSpaceMapper nameSpaceMapper;

    public NameSpaceServiceImpl(NameSpaceRepository nameSpaceRepository, NameSpaceMapper nameSpaceMapper) {
        this.nameSpaceRepository = nameSpaceRepository;
        this.nameSpaceMapper = nameSpaceMapper;
    }

    @Override
    public List<NameSpaceResponseDTO> findAllZone() {
        List<Namespaces> namespaces = nameSpaceRepository.findAll();
        return namespaces.stream().map(nameSpaceMapper::namespacesToNameSpaceResponseDTO).collect(Collectors.toList());
    }

    @Override
    public NameSpaceResponseDTO getNameSpaceById(Long id) {
        Optional<Namespaces> namespaces = nameSpaceRepository.findById(id);
        if (namespaces.isPresent()) {
            Namespaces namespacesGet = namespaces.get();

            return nameSpaceMapper.namespacesToNameSpaceResponseDTO(namespacesGet);

        } else {
            throw new ResourceNotFoundException();
        }
    }

    @Override
    public NameSpaceResponseDTO addNameSpace(NameSpaceRequestDTO dto) {
        Namespaces save = nameSpaceRepository.save(nameSpaceMapper.namespacesRequestDTOToNamespaces(dto));

        return nameSpaceMapper.namespacesToNameSpaceResponseDTO(save);
    }
}
