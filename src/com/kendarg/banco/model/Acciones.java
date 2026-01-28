package com.kendarg.banco.model;
import java.util.*;

public class Acciones {
    private Map<String, Banco> datos;

    private int numeroUsuario = 100000;
    public Acciones(){
        datos = new HashMap<>();
    }
    //1. Agregar Usuario
    public boolean agregarUsuario(Banco usuario){
        if(datos.containsKey(usuario.getCedula())){
            return false;
        } 
        usuario.setNumeroCuenta(numeroUsuario);
        datos.put(usuario.getCedula(), usuario);
        numeroUsuario++;
        return true;
    }

    //
    
    
    //5. Ver Informacion del Cliente
    public Map<String, Banco>getDatos(){
        return datos;
    }
    
    //
}
