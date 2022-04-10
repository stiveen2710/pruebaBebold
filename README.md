//Prueba Be Bold

/*Implementacion endpoints Cliente*/


/*Endpoint Crear/Actualizar Cliente*/
http://localhost:8080/api/postCliente

{
    
    "documentoCliente":"12345",
    "nombresCliente":"Rocky",
    "apellidosCliente":"Balboa",
    "edadCliente":"22",
    "telefonoCliente":"4567788",
    "correoCliente":"rocky.bal@gmail.com"
}

/*Respuesta*/

{
    "clienteId": 6,
    "documentoCliente": "12345",
    "nombresCliente": "Rocky",
    "apellidosCliente": "Balboa",
    "edadCliente": "22",
    "telefonoCliente": "4567788",
    "correoCliente": "rocky.bal@gmail.com"
}

/*Endpoint eliminar Cliente*/
http://localhost:8080/api/delete/1

/*Endpoint Consultar Cliente*/
http://localhost:8080/api/getCliente/6
{
    "clienteId": 6,
    "documentoCliente": "12345",
    "nombresCliente": "Rocky",
    "apellidosCliente": "Balboa",
    "edadCliente": "22",
    "telefonoCliente": "4567788",
    "correoCliente": "rocky.bal@gmail.com"
}


/*Implementacion endpoints Cuenta*/

/*Endpoint Crear Cuenta*/
http://localhost:8080/api/postCuenta
{
    "idcuenta":"4",
    "idCliente":"5",
    "saldoCuenta":"165000"
}

/*Respuesta*/

{
    "cuentaId": 16,
    "idCliente": 5,
    "saldoCuenta": "165000"
}


/*Implementacion endpoint para Realizar Retiros*/

/*Endpoint Retiros Cliente*/
http://localhost:8080/api/postRetiro

/*Retiro Aprobado*/

{
    "tipoTransaccion":"retiro",
    "valorTransaccion":"5000",
    "idRemitente":1,
    "idReceptor":1
}

/*Respuesta*/

{
    "id": 36,
    "tipoTransaccion": "retiro",
    "valorTransaccion": "5000",
    "idRemitente": 1,
    "idReceptor": 1
}



/*Retiro rechazado*/
{
    "tipoTransaccion":"retiro",
    "valorTransaccion":"500000",
    "idRemitente":1,
    "idReceptor":1
}

/*Respuesta*/

{
    "id": 35,
    "tipoTransaccion": "rechazada",
    "valorTransaccion": "500000",
    "idRemitente": 1,
    "idReceptor": 1
}


/*Implementacion endpoint para Realizar Transferencias entre cuentas*/

/*Endpoint Transferencias entre Cuentas*/
http://localhost:8080/api/postTransaccion

/*Prueba1 Transaccion Aprobada*/

{
    "tipoTransaccion":"Transaccion",
    "valorTransaccion":"5000",
    "idRemitente":2,
    "idReceptor":1
}

/*Respuesta*/

{
    "id": 38,
    "tipoTransaccion": "Transaccion",
    "valorTransaccion": "5000",
    "idRemitente": 2,
    "idReceptor": 1
}

/*Prueba2 Transaccion Rechazada*/

{
    "tipoTransaccion":"Transaccion",
    "valorTransaccion":"500000",
    "idRemitente":2,
    "idReceptor":1
}

/*Respuesta*/

{
    "id": 39,
    "tipoTransaccion": "rechazada por falta de saldo",
    "valorTransaccion": "500000",
    "idRemitente": 2,
    "idReceptor": 1
}

/*Prueba3 Rechazado por cuenta invalida*/
{
    "tipoTransaccion":"Transaccion",
    "valorTransaccion":"500000",
    "idRemitente":5,
    "idReceptor":1
}

/*Respuesta*/
{
    "id": 34,
    "tipoTransaccion": "rechazada por cuenta invalida",
    "valorTransaccion": "500000",
    "idRemitente": 5,
    "idReceptor": 1
}


/*Implementacion Consulta Retiros reaizados*/

http://localhost:8080/api/getRetiros

{
    "tipoTransaccion": "retiro",
    "idRemitente":1  
}

/*Reporte Retiros*/
[
    {
        "id": 1,
        "tipoTransaccion": "retiro",
        "valorTransaccion": "50000",
        "idRemitente": 1,
        "idReceptor": 1
    },
    {
        "id": 2,
        "tipoTransaccion": "retiro",
        "valorTransaccion": "10000",
        "idRemitente": 1,
        "idReceptor": 1
    },
    {
        "id": 3,
        "tipoTransaccion": "retiro",
        "valorTransaccion": "10000",
        "idRemitente": 1,
        "idReceptor": 1
    },
    {
        "id": 4,
        "tipoTransaccion": "retiro",
        "valorTransaccion": "200000",
        "idRemitente": 1,
        "idReceptor": 1
    },
    {
        "id": 5,
        "tipoTransaccion": "retiro",
        "valorTransaccion": "200000",
        "idRemitente": 1,
        "idReceptor": 1
    }
]

/*Implementacion Tranferencias reaizadas*/

http://localhost:8080/api/getTransacciones

{
    "tipoTransaccion": "Transaccion",
    "valorTransaccion": "200000",
    "idRemitente":2,
     "idReceptor": 1

}

/*Reporte Transferencias*/

[
    {
        "id": 10,
        "tipoTransaccion": "Transaccion",
        "valorTransaccion": "50000",
        "idRemitente": 2,
        "idReceptor": 1
    },
    {
        "id": 21,
        "tipoTransaccion": "Transaccion",
        "valorTransaccion": "5000",
        "idRemitente": 2,
        "idReceptor": 1
    },
    {
        "id": 25,
        "tipoTransaccion": "Transaccion",
        "valorTransaccion": "5000",
        "idRemitente": 2,
        "idReceptor": 1
    },
    {
        "id": 26,
        "tipoTransaccion": "Transaccion",
        "valorTransaccion": "5000",
        "idRemitente": 2,
        "idReceptor": 1
    },
    {
        "id": 27,
        "tipoTransaccion": "Transaccion",
        "valorTransaccion": "5000",
        "idRemitente": 2,
        "idReceptor": 1
    },
    {
        "id": 28,
        "tipoTransaccion": "Transaccion",
        "valorTransaccion": "5000",
        "idRemitente": 2,
        "idReceptor": 1
    },
    {
        "id": 29,
        "tipoTransaccion": "Transaccion",
        "valorTransaccion": "5000",
        "idRemitente": 2,
        "idReceptor": 1
    },
    {
        "id": 30,
        "tipoTransaccion": "Transaccion",
        "valorTransaccion": "5000",
        "idRemitente": 2,
        "idReceptor": 1
    },
    {
        "id": 31,
        "tipoTransaccion": "Transaccion",
        "valorTransaccion": "5000",
        "idRemitente": 2,
        "idReceptor": 1
    }
]

/*Cliente 1*/

{
    "tipoTransaccion": "Transaccion",
    "valorTransaccion": "200000",
    "idRemitente":1,
     "idReceptor": 3

}

/*Reporte Transferencias*/

[
    {
        "id": 9,
        "tipoTransaccion": "Transaccion",
        "valorTransaccion": "50000",
        "idRemitente": 1,
        "idReceptor": 2
    },
    {
        "id": 19,
        "tipoTransaccion": "Transaccion",
        "valorTransaccion": "5000",
        "idRemitente": 1,
        "idReceptor": 2
    }
]






