package com.dpc.controller;

import com.dpc.dto.ZoneRequestDTO;
import com.dpc.dto.ZoneResponseDTO;
import com.dpc.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/zone")
public class ZoneController {
@Autowired
    private final ZoneService zoneService;

    public ZoneController(ZoneService zoneService) {
        this.zoneService = zoneService;
    }

    @GetMapping
    List<ZoneResponseDTO> findAllZone(){
        return  zoneService.findAllZone();
    }


    @GetMapping("/{id}")
    public ZoneResponseDTO getZoneById(@PathVariable("id") Long id) {
        return this.zoneService.getZoneById(id);

    }

    @PostMapping("")
    public ZoneResponseDTO addZone(@RequestBody ZoneRequestDTO dto) {
        return
                this.zoneService.addZone(dto);

    }
}
