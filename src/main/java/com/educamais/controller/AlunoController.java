package com.educamais.controller;

import com.educamais.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/alunos")
public class AlunoController {

    @Autowired
    private AlunoService service;


}
