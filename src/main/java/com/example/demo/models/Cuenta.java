package com.example.demo.models;

import javax.persistence.*;

//Modelo de Cuenta
@Entity
@Table(name="Cuenta")
public class Cuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false, name = "idcuenta")
    private int cuentaId;

    //Se llama una cuenta por usuario atraves del unique
    @Column(name= "clienteid",unique = true)
    public int idCliente;

    @Column(name= "saldo")
    public String saldoCuenta;

    public Cuenta() {
    }


    //Metodos get - set
    public int getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(int cuentaId) {
        this.cuentaId = cuentaId;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(String saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
}
