package com.gabrieldev.simulador_investimentos.service;

import com.gabrieldev.simulador_investimentos.model.Simulacao;
import com.gabrieldev.simulador_investimentos.model.TipoRendimento;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class SimulacaoService {


    public Double calcularRetornoFinal(Simulacao simulacao) {
        double valor = simulacao.getValorInicial();
        double aporte = simulacao.getAporteMensal();
        double taxa = simulacao.getTaxaJuros() / 100;
        int meses = Optional.ofNullable(simulacao.getPeriodoMeses())
                .orElseThrow(() -> new IllegalArgumentException("O campo 'periodoMeses' não pode ser nulo."));


        if (simulacao.getTipoRendimento() == TipoRendimento.SIMPLES) {
            return valor + (aporte * meses) + (valor * taxa * meses);
        } else {
            for (int i = 0; i < meses; i++) {
                valor = (valor + aporte) * (1 + taxa);
            }
            return valor;
        }
    }

}