package com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    // Data do evento
    private int dia;
    private int mes;
    private int ano;
    // Distancia percorrida
    private int distancia; // metros
    // Tempo que o corredor levou para percorrer a distancia
    private int horas;
    private int minutos;
    private int segundos;
    
    public Evento(String nome, int dia, int mes, int ano, int distancia, int horas, int minutos, int segundos) {
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.distancia = distancia;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    protected Evento() {}

    public String getNome() {
        return nome;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int getDistancia() {
        return distancia;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    @Override
    public String toString() {
        return "Evento [ano=" + ano + ", dia=" + dia + ", distancia=" + distancia + ", horas=" + horas + ", id=" + id
                + ", mes=" + mes + ", minutos=" + minutos + ", nome=" + nome + ", segundos=" + segundos + "]";
    }
}
