package com.dpc.serviceImp;

import com.dpc.dto.ZoneRequestDTO;
import com.dpc.dto.ZoneResponseDTO;
import com.dpc.entities.Namespaces;
import com.dpc.entities.Zone;
import com.dpc.exceptions.ResourceNotFoundException;
import com.dpc.mappers.ZoneMapper;
import com.dpc.repository.NameSpaceRepository;
import com.dpc.repository.ZoneRepository;
import com.dpc.service.ZoneService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class ZoneServiceImpl  implements ZoneService {

    private final ZoneRepository zoneRepository;
    private final ZoneMapper zoneMapper;
    private final NameSpaceRepository nameSpaceRepository;

    public ZoneServiceImpl(ZoneRepository zoneRepository, ZoneMapper zoneMapper, NameSpaceRepository nameSpaceRepository) {
        this.zoneRepository = zoneRepository;
        this.zoneMapper = zoneMapper;
        this.nameSpaceRepository = nameSpaceRepository;
    }

    @Override
    public List<ZoneResponseDTO> findAllZone() {

        List<Zone> zoneList = zoneRepository.findAll();
        zoneList.forEach(zone -> {
            List<Namespaces> namespaces = nameSpaceRepository.findByZnameId(zone.getId());
            zone.setNamespaces(namespaces);
        });
        return zoneList.stream().map(zoneMapper::zoneToZoneResponseDTO).collect(Collectors.toList());
    }

    @Override
    public ZoneResponseDTO getZoneById(Long id) {
        Optional<Zone> zone = zoneRepository.findById(id);
        if (zone.isPresent()) {
            Zone zoneGet = zone.get();
            return zoneMapper.zoneToZoneResponseDTO(zoneGet);

        } else {
            throw new ResourceNotFoundException();
        }
    }

    @Override
    public ZoneResponseDTO addZone(ZoneRequestDTO dto) {
        Zone sectionSaved = this.zoneRepository.save(zoneMapper.zoneRequestDTOToZone(dto));
            return zoneMapper.zoneToZoneResponseDTO(sectionSaved);
    }
}
