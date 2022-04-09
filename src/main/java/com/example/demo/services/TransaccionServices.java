package com.example.demo.services;

import com.example.demo.models.Cuenta;
import com.example.demo.models.Transaccion;
import com.example.demo.repositories.CuentaRepositories;
import com.example.demo.repositories.TransaccionRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class TransaccionServices {

    @Autowired
    CuentaRepositories cuentaRepositories;

    @Autowired
    TransaccionRepositories transaccionRepositories;

    @Autowired
    CuentaServices cuentaServices;

    public ArrayList<Transaccion> getTransaccion(){return null;}

    public ArrayList<Transaccion> getTransacciones(Transaccion transaccion){
        ArrayList<Transaccion> datos = transaccionRepositories.findBytipoTransaccion("Transaccion");
        ArrayList<Transaccion> seleccionado = new ArrayList<Transaccion>();

        for(Transaccion i : datos){
            if(i.getIdRemitente()==transaccion.getIdRemitente()){
                seleccionado.add(i);
            }else{
                continue;
            }
        }

        return seleccionado;
    }

    public ArrayList<Transaccion> getRetiros(Transaccion transaccion){
        ArrayList<Transaccion> datos = transaccionRepositories.findBytipoTransaccion("Retiro");
        ArrayList<Transaccion> seleccionado = new ArrayList<Transaccion>();

        for(Transaccion i : datos){
            if(i.getIdRemitente()==transaccion.getIdRemitente()){
                seleccionado.add(i);
            }else{
                continue;
            }
        }

        return seleccionado;
    }

    public Transaccion retiro(Transaccion transaccion){
        Cuenta cuenta = cuentaServices.getCuenta(transaccion.getIdReceptor());
        Cuenta cuentaActualizacion = new Cuenta();

        if(Integer.parseInt(transaccion.getValorTransaccion())<=Integer.parseInt(cuenta.getSaldoCuenta())){

        cuentaActualizacion.setCuentaId(cuenta.getCuentaId());
        cuentaActualizacion.setIdCliente(cuenta.getIdCliente());
        cuentaActualizacion.setSaldoCuenta(String.valueOf(Integer.parseInt(cuenta.getSaldoCuenta())-Integer.parseInt(transaccion.getValorTransaccion())));

        cuentaRepositories.save(cuentaActualizacion);

        }else{
        transaccion.setTipoTransaccion("rechazada");
        }

        return transaccionRepositories.save(transaccion);
    }

    public Transaccion transaccion(Transaccion transaccion){
        try{
        Cuenta cuentaRemitente = cuentaServices.getCuenta(transaccion.getIdRemitente());
        Cuenta cuentaReceptor = cuentaServices.getCuenta(transaccion.getIdReceptor());
        Cuenta cuentaRemitenteActualizacion = new Cuenta();
        Cuenta cuentaReceptorActualizacion = new Cuenta();

        if(Integer.parseInt(transaccion.getValorTransaccion())<=Integer.parseInt(cuentaRemitente.getSaldoCuenta())){

            cuentaRemitenteActualizacion.setCuentaId(cuentaRemitente.getCuentaId());
            cuentaRemitenteActualizacion.setIdCliente(cuentaRemitente.getIdCliente());
            cuentaRemitenteActualizacion.setSaldoCuenta(String.valueOf(Integer.parseInt(cuentaRemitente.getSaldoCuenta())-Integer.parseInt(transaccion.getValorTransaccion())));

            cuentaReceptorActualizacion.setCuentaId(cuentaReceptor.getCuentaId());
            cuentaReceptorActualizacion.setIdCliente(cuentaReceptor.getIdCliente());
            cuentaReceptorActualizacion.setSaldoCuenta(String.valueOf(Integer.parseInt(cuentaReceptor.getSaldoCuenta())+Integer.parseInt(transaccion.getValorTransaccion())));

            cuentaRepositories.save(cuentaRemitenteActualizacion);
            cuentaRepositories.save(cuentaReceptorActualizacion);

        }else{
            transaccion.setTipoTransaccion("rechazada por falta de saldo");
        }
        }catch (Exception e){
            transaccion.setTipoTransaccion("rechazada por cuenta invalida");
        }

        return transaccionRepositories.save(transaccion);
    }

    public Transaccion postTransaccion(Transaccion transaccion){return null;}
}
