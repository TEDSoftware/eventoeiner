package com.einereventos.ecommerce.service.einerEventos.controller;

import com.einereventos.ecommerce.service.einerEventos.entity.DocumentoAlmacenado;
import com.einereventos.ecommerce.service.einerEventos.service.DocumentoAlmacenadoService;
import com.einereventos.ecommerce.service.einerEventos.utils.GenericResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/documento-almacenado")

public class DocumentoAlmacenadoController {
    private DocumentoAlmacenadoService service;

    public DocumentoAlmacenadoController(DocumentoAlmacenadoService service) {
        this.service = service;
    }

    @GetMapping
    public GenericResponse list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GenericResponse find(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/download/{fileName}")
    public ResponseEntity<Resource> download(@PathVariable String fileName, HttpServletRequest request) {
        return service.downloadByFileName(fileName, request);
    }

    @PostMapping
    public GenericResponse save(@ModelAttribute DocumentoAlmacenado obj) {
        return service.save(obj);
    }

    public GenericResponse update(Long aLong, DocumentoAlmacenado obj) {
        return null;
    }

    public GenericResponse delete(Long aLong) {
        return null;
    }
}
