package com.rios.commons.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Component
public class CommonServiceImpl<E, R extends CrudRepository<E, Long>> implements CommonService<E> {
    @Autowired
    private R dao;


    @Override
    @Transactional(readOnly = true)
    public Iterable findAll() {
        return dao.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return Optional.empty();
    }

    @Override
    @Transactional
    public E save(E entity) {
        return dao.save(entity);
    }


    @Override
    public void deleteById(Long id) {

    }
}
