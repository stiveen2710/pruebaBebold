package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name="Transaccion")
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private  int id;

    @Column(name="tipo")
    private String tipoTransaccion;

    @Column(name="valor")
    private String valorTransaccion;

    @Column(name="remitente")
    private int idRemitente;

    @Column(name="receptor")
    private int idReceptor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public String getValorTransaccion() {
        return valorTransaccion;
    }

    public void setValorTransaccion(String valorTransaccion) {
        this.valorTransaccion = valorTransaccion;
    }

    public int getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(int idRemitente) {
        this.idRemitente = idRemitente;
    }

    public int getIdReceptor() {
        return idReceptor;
    }

    public void setIdReceptor(int idReceptor) {
        this.idReceptor = idReceptor;
    }
}
