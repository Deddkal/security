package com.mindhub.security.service.impl;

import com.mindhub.security.models.Pet;
import com.mindhub.security.service.GenericService;

import java.util.List;
import java.util.UUID;

public class PetServiceImpl implements GenericService<Pet, UUID> {


    @Override
    public void saveEntity(Pet entity) {

    }

    @Override
    public List<Pet> findAll() {
        return List.of();
    }

    @Override
    public Pet findById(UUID uuid) {
        return null;
    }

    @Override
    public void deleteById(UUID uuid) {

    }
}
