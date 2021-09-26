package com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.repositorios;

import java.util.List;

import com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.entidades.Evento;
import org.springframework.data.repository.CrudRepository;

public interface IEventoRepository extends CrudRepository<Evento, Long> {

    List<Evento> findAll();
    // ver se precisa fazer algo
    Evento save(Evento evento);
}
