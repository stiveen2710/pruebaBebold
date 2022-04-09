package com.example.demo.models;

import javax.persistence.*;


@Entity
@Table(name="Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false, name = "idCliente")
    public int clienteId;

    @Column(name= "documento")
    public String documentoCliente;

    @Column(name= "nombres")
    public String nombresCliente;

    @Column(name= "apellidos")
    public String apellidosCliente;

    @Column(name= "edad")
    public String edadCliente;

    @Column(name= "telefono")
    public String telefonoCliente;

    @Column(name= "correo")
    private String correoCliente;

    //
    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getdocumentoCliente() {
        return documentoCliente;
    }

    public void setdocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(String edadCliente) {
        this.edadCliente = edadCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }
}
