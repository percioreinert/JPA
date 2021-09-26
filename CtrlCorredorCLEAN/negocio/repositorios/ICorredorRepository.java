package com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.repositorios;

import java.util.List;


import com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.entidades.Corredor;
import org.springframework.data.repository.CrudRepository;

public interface ICorredorRepository extends CrudRepository<Corredor, Long> {

    List<Corredor> findAll();
    void deleteAll();
    // ver se precisa fazer algo
    Corredor save(Corredor corredor);
}
