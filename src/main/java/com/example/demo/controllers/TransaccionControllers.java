package com.example.demo.controllers;

import com.example.demo.models.Transaccion;
import com.example.demo.services.TransaccionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class TransaccionControllers {

   @Autowired
    TransaccionServices transaccionServices;

   /*Endpoints Transaccion*/


   /*Endpoints Listar Transaccion*/
   @GetMapping("/getTransaccion")
    public ArrayList<Transaccion> getTransaccion() { return transaccionServices.getTransaccion();}

    /*Endpoints Consultar Transacciones Cliente*/
    @PostMapping("/getTransacciones")
    public ArrayList<Transaccion> getTransacciones(@RequestBody Transaccion transaccion) { return transaccionServices.getTransacciones(transaccion);}

    /*Endpoints Consultar Retiros Cliente*/
    @PostMapping("/getRetiros")
    public ArrayList<Transaccion> getRetiro(@RequestBody Transaccion transaccion) { return transaccionServices.getRetiros(transaccion);}

    /*Endpoints Transferencia*/
    @PostMapping("/postTransaccion")
    public Transaccion postTransaccion(@RequestBody Transaccion transaccion) { return transaccionServices.transaccion(transaccion);}

    /*Endpoints Retiro*/
    @PostMapping("/postRetiro")
    public Transaccion postRetiro(@RequestBody Transaccion transaccion) { return transaccionServices.retiro(transaccion); }

}
