package com.example.demo.repositories;


import com.example.demo.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.ArrayList;


@Repository
public interface ClienteRepositories extends JpaRepository <Cliente,Integer>{

    //Query Cliente
    Cliente findByclienteId(int clienteId);

}
