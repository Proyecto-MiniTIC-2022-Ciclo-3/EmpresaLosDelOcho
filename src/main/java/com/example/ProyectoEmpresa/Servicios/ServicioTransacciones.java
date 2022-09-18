package com.example.ProyectoEmpresa.Servicios;


import com.example.ProyectoEmpresa.Entidades.Transacciones;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface ServicioTransacciones {


    List<Transacciones> listarTransacciones();
    public Transacciones guardarTransacciones (Transacciones transacciones);
    public Transacciones consultarTransaccionesPorID(Long idTransacciones);
    public Transacciones actualizarTransacciones(Transacciones transacciones);
    public void eliminarTransaccionesPorId(Long idTransacciones);
    public Transacciones actualizarPorId(Long idTransac, Map<Object,Object> objectMap);

    @Query("select * from Transacciones where nit_empresa =?1")
    public List<Transacciones> findbysqlmovimiento(Long idtransaccion);


}
