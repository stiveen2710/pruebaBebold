package com.example.demo.controllers;


import com.example.demo.models.Cuenta;
import com.example.demo.models.Transaccion;
import com.example.demo.services.CuentaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class CuentaControllers {

    @Autowired
    CuentaServices cuentaServices;

    /*Endpoints Cuenta*/


    /*Endpoints Listar Cuenta*/
    @GetMapping("/getCuenta")
    public ArrayList<Cuenta> getCuenta() { return cuentaServices.getCuenta();}


    /*Endpoints Crear/Actualizar*/
    @PostMapping("/postCuenta")
    public Cuenta postCuenta(@RequestBody Cuenta cuenta) { return cuentaServices.postCuenta(cuenta);}


}

