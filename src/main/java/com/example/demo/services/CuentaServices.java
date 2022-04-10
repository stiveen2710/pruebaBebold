package com.example.demo.services;

import com.example.demo.models.Cliente;
import com.example.demo.models.Cuenta;
import com.example.demo.repositories.ClienteRepositories;
import com.example.demo.repositories.CuentaRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CuentaServices {

    @Autowired
    CuentaRepositories cuentaRepositories;

    public Cuenta getCuenta(int id){ return cuentaRepositories.getById(id); }

    public ArrayList<Cuenta> getCuenta(){ return  (ArrayList<Cuenta>) cuentaRepositories.findAll();}

    public Cuenta postCuenta(Cuenta cuenta){return cuentaRepositories.save(cuenta);}

}
