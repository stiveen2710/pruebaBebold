package com.example.demo.controllers;


import com.example.demo.models.Cliente;
import com.example.demo.models.Transaccion;
import com.example.demo.services.ClienteServices;
import com.example.demo.services.TransaccionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class ClienteControllers {

    @Autowired
    ClienteServices clienteServices;

    /*Endpoints cliente*/


    /*Endpoints Listar*/
    @GetMapping("/getCliente")
    public ArrayList<Cliente> getCliente() { return clienteServices.getCliente();}

    //Endpoints Consultar cliente
    @GetMapping(path = "getCliente/{ID}")
    public Cliente getClienteEspecifico(@PathVariable("ID") Integer ID) {return clienteServices.getClienteEspecifico(ID); }

    //Endpoints Crear/Actualizar
    @PostMapping("/postCliente")
    public Cliente postCliente(@RequestBody Cliente cliente) { return clienteServices.postCliente(cliente);}

    //Endpoints Eliminar
    @DeleteMapping(path = "delete/{ID}")
    public void deleteCliente(@PathVariable("ID") int ID) {clienteServices.delete(ID); }


}
