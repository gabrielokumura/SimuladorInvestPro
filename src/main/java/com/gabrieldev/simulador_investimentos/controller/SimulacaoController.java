package com.gabrieldev.simulador_investimentos.controller;

import com.gabrieldev.simulador_investimentos.model.Simulacao;
import com.gabrieldev.simulador_investimentos.service.SimulacaoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/simulacoes")
public class SimulacaoController {

    private final SimulacaoService simulacaoService;

    public SimulacaoController(SimulacaoService simulacaoService){
        this.simulacaoService = simulacaoService;
    }



    @PostMapping
    public Double simular(@RequestBody Simulacao simulacao) {
        return simulacaoService.calcularRetornoFinal(simulacao);
    }

}
