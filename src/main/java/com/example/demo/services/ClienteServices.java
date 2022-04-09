package com.example.demo.services;


import com.example.demo.models.Cliente;
import com.example.demo.models.Cuenta;
import com.example.demo.repositories.ClienteRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClienteServices {

    @Autowired
    ClienteRepositories clienteRepositories;

    public  Cliente getClienteEspecifico(Integer id){
        return clienteRepositories.findByclienteId(id);
    }

    public ArrayList<Cliente> getCliente(){ return  (ArrayList<Cliente>) clienteRepositories.findAll();}

    public Cliente postCliente(Cliente cliente){return clienteRepositories.save(cliente);}

    public void delete(int id){clienteRepositories.delete(getClienteEspecifico(id));}

}
