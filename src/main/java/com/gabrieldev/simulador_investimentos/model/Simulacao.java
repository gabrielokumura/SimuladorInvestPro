package com.gabrieldev.simulador_investimentos.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Simulacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valorInicial;
    private Double aporteMensal;
    private Double taxaJuros;
    private Integer periodoMeses;

    @Enumerated(EnumType.STRING)
    private TipoRendimento tipoRendimento;

    public Double getAporteMensal() {
        return aporteMensal;
    }

    public void setAporteMensal(Double aporteMensal) {
        this.aporteMensal = aporteMensal;
    }

    public Integer getPeriodoMeses() {
        return periodoMeses;
    }

    public void setPeriodoMeses(Integer periodoMeses) {
        this.periodoMeses = periodoMeses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(Double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public TipoRendimento getTipoRendimento() {
        return tipoRendimento;
    }

    public void setTipoRendimento(TipoRendimento tipoRendimento) {
        this.tipoRendimento = tipoRendimento;
    }
}
