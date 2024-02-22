package com.sisvendas.sisvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sisvendas.sisvendas.models.BaseModel;

import java.util.List; // Importação necessária

public abstract class BaseService<TEntity extends BaseModel, IRepository extends JpaRepository<TEntity, Long>> {

    @Autowired
    private IRepository repository;

   
    public List<TEntity> retornarTodos() {
        List<TEntity> result = repository.findAll();
        return result;
    }
}
