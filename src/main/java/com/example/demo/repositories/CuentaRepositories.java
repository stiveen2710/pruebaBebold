package com.example.demo.repositories;

import com.example.demo.models.Cliente;
import com.example.demo.models.Cuenta;
import com.example.demo.models.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface CuentaRepositories extends JpaRepository<Cuenta,Integer> {


      //Query Cuenta
      Cuenta findByidCliente(int idCliente);

}
