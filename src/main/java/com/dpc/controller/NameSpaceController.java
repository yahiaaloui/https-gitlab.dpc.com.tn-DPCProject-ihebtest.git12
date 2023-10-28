package com.dpc.controller;

import com.dpc.dto.NameSpaceRequestDTO;
import com.dpc.dto.NameSpaceResponseDTO;
import com.dpc.dto.ZoneRequestDTO;
import com.dpc.dto.ZoneResponseDTO;
import com.dpc.service.NameSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/nameSpace")
public class NameSpaceController {
@Autowired
    private final NameSpaceService nameSpaceService;

    public NameSpaceController(NameSpaceService nameSpaceService) {
        this.nameSpaceService = nameSpaceService;
    }


    @GetMapping
    List<NameSpaceResponseDTO> findAllNameSpace(){
        return  nameSpaceService.findAllZone();
    }


    @GetMapping("/{id}")
    public NameSpaceResponseDTO getNameSpaceById(@PathVariable("id") Long id) {
        return this.nameSpaceService.getNameSpaceById(id);

    }

    @PostMapping("")
    public NameSpaceResponseDTO addNameSpace(@RequestBody NameSpaceRequestDTO dto) {
        return
                this.nameSpaceService.addNameSpace(dto);

    }
}
