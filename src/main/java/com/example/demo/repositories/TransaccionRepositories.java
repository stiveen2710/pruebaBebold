package com.example.demo.repositories;

import com.example.demo.models.Cliente;
import com.example.demo.models.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TransaccionRepositories extends JpaRepository<Transaccion,Integer> {

   /*Querys tipo transaccion - Remitente -Receptor*/
   ArrayList<Transaccion> findBytipoTransaccion(String tipoTransaccion);
   ArrayList<Transaccion> findByidRemitente(int idRemitente);
   ArrayList<Transaccion> findByidReceptor(int idReceptor);
}
