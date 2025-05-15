package com.mindhub.security.service.impl;

import com.mindhub.security.models.Client;
import com.mindhub.security.service.ClientService;
import com.mindhub.security.service.GenericService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {


    @Override
    public void saveEntity(Client entity) {
        System.out.println("hola mundo");
    }

    @Override
    public List<Client> findAll() {
        return List.of();
    }

    @Override
    public Client findById(Long aLong) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Client findByEmail(String email) {
        return null;
    }
}
