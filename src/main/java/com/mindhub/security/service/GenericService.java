package com.mindhub.security.service;

import java.util.List;

public interface GenericService<E , ID > {

//    CREATE
    void saveEntity(E entity);

//    READ
    List<E> findAll();
    E findById(ID id);

//    UPDATE
//    DELETE
    void deleteById(ID id);


}
