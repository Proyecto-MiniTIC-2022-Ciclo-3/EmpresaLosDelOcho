package com.example.ProyectoEmpresa.Controladores;

import com.example.ProyectoEmpresa.Entidades.Empresas;
import com.example.ProyectoEmpresa.Entidades.Transacciones;
import com.example.ProyectoEmpresa.Repositorio.RepositorioEmpresa;
import com.example.ProyectoEmpresa.Servicios.ServicioImpEmpresas;
import com.example.ProyectoEmpresa.Servicios.ServicioImpTransacciones;
import com.example.ProyectoEmpresa.Servicios.ServicioTransacciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/transaccion")

public class ControladorMovEmpresa {

    @Autowired
    private ServicioImpTransacciones sit;

    @GetMapping
    public List<Transacciones> listar(){ return sit.listarTransacciones();
    }

    //Controlador para consultar por Id
    @GetMapping("/{id}")
    public Transacciones consultarporId(@PathVariable("id") Long id){
        return sit.consultarTransaccionesPorID(id);
    }

    //Controlador para guardar datos
    @PostMapping
    public Transacciones insertar(@RequestBody Transacciones transac){
        return sit.guardarTransacciones(transac);
    }

    // Controlador para actualizar informacion
    @PutMapping
    public Transacciones actualizar(@RequestBody Transacciones transac) {
        return sit.actualizarTransacciones(transac);
    }

    //Controlador para eliminar
    /*@DeleteMapping
    public void eliminar(@RequestBody Empresas empre){
        sie.eliminarEmpresas(empre.getNitEmpresa());
    }*/

    //Controlador para eliminar por Id
    @DeleteMapping("/{id}")
    public void eliminarporId(@PathVariable Long id){
        sit.eliminarTransaccionesPorId(id);
    }

    //Controlador para actualizar por Id
    @PatchMapping("/{id}")
    public Transacciones actualizarPorId(@PathVariable("id")Long id, @RequestBody Map<Object,Object> objectMap){
        return sit.actualizarPorId(id,objectMap);
    }


     /*ServicioImpTransacciones servicio;
    public ControladorMovEmpresa(ServicioImpTransacciones servicio){this.servicio= servicio;}*/

    //@GetMapping
    //private List<Transacciones> listar(){return sit.listarTransacciones();}

    //Controlador para consultar por Id
    /*@GetMapping
    public Empresas consultarporId(@PathVariable("nitempresa") Long nitempresa){
        return sie.consultarEmpresasPorNIT(nitempresa);
    }

    @PostMapping
    public ResponseEntity<Transacciones> guardarmov(@RequestBody Transacciones transacciones){

        sie.listarEmpresas();

        return null;
    }*/


    /*@GetMapping("/listarempresa/{idm}")
    public List<Transacciones> porlibro(@PathVariable("idm") Long idm){
        return servicio.listarporlibro(idm);

    }

    @PostMapping("/empresa/{id}/{movimiento}")
    public Transacciones add(@PathVariable("idm") Long idm, @PathVariable("movimiento") Long mov, @Validated @RequestBody Transacciones transacciones){

        return servicio.agregarTransaccion(idm,mov,transacciones);
    }*/
}
