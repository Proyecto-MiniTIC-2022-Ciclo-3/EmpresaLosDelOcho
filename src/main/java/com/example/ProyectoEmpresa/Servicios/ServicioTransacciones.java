package com.example.ProyectoEmpresa.Servicios;


import com.example.ProyectoEmpresa.Entidades.Transacciones;

import java.util.List;
import java.util.Map;

public interface ServicioTransacciones {


    List<Transacciones> listarTransacciones();
    public Transacciones guardarTransacciones (Transacciones transacciones);
    public Transacciones consultarTransaccionesPorID(Long idTransacciones);
    public Transacciones actualizarTransacciones(Transacciones transacciones);
    public void eliminarTransaccionesPorId(Long idTransacciones);
    public Transacciones actualizarPorId(Long idTransac, Map<Object,Object> objectMap);






}
