package com.mindhub.security.service;

import com.mindhub.security.models.Client;
import org.springframework.stereotype.Service;


// Contrato
public interface ClientService extends GenericService<Client, Long> {

//    Firma de los metodos
    Client findByEmail(String email);
}
