package com.kendarg.banco.app;

import com.kendarg.banco.model.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Acciones datos = new Acciones();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("====================================");
            System.out.println("        BANCO KENDARG");
            System.out.println("====================================");
            System.out.println("");
            System.out.println("Selecione una opcion:");
            System.out.println("1. Crear Cuenta");
            System.out.println("2. Depositar Dinero");
            System.out.println("3. Retirar Dinero");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Ver Informacion del Cliente");
            System.out.println("0. Salir");
            System.out.println("");            
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
                switch (opcion) {
                    case 1:
                    System.out.println("---------------------");
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Documento: ");
                    String cedula = sc.nextLine();
                    System.out.print("Correeo: ");
                    String correo = sc.nextLine();
                    boolean validar = false;
                    String tipoCuenta = ""; 
                    while (!validar) {
                        System.out.println("Seleccione Tipo de Cuenta: ");
                        System.out.println("1. Ahorros");            
                        System.out.println("2. Corriente");            
                        System.out.print("Opcion: ");
                        int opcion2 = sc.nextInt();
                        switch (opcion2) {
                            case 1:
                            tipoCuenta = "Ahorros";
                            validar = true;
                                break;
                            case 2:
                            tipoCuenta = "Corriente";
                            validar = true;
                                break;
                            default:
                            System.out.println("Opcion No Valida");
                        }                        
                    }
                    double saldo = 0.0;                    
                    Banco usuario = new Banco(nombre, cedula, correo, tipoCuenta, saldo);
                    if(datos.agregarUsuario(usuario)){
                    System.out.println("Usuario Registrado");
                    System.out.println("Su Numero de Cuenta es: " + usuario.getNumeroCuenta());
                    System.out.println("Su Saldo en la Cuenta es: " + usuario.getSaldo());

                    }else{
                    System.out.println("Usuario ya Existe");            
                    }
                        
                    break;

                    case 2:
                    System.out.println("---------------------");
                    System.out.println("Ingrese su Cedula:");
                    String deposito = sc.nextLine();
                    Banco ingreso = datos.getDatos().get(deposito);
                    if(ingreso != null){
                        System.out.print("Ingrese Monto: ");
                        double monto = sc.nextDouble();
                        sc.nextLine();
                        ingreso.depositar(monto);
                        System.out.println("Deposito Ingresado con Exito");
                        System.out.println("Su Nuevo Saldo es de: " + ingreso.getSaldo());
                    }
                    break; 
                    
                    case 3:
                    System.out.println("---------------------");
                    System.out.println("Ingrese su Cedula:");
                    String retiro = sc.nextLine();
                    Banco salida = datos.getDatos().get(retiro);
                    if(salida != null){
                        System.out.println("Indique el Monto del Retiro");
                        double monto = sc.nextDouble();
                        sc.nextLine();
                        salida.retiro(monto);
                        System.out.println("Retiro Realizado con Exito");
                        System.out.println("Su Nuevo Saldo es de: " + salida.getSaldo());
                    }                                
                    break; 

                    case 4:
                    System.out.println("---------------------");
                    System.out.println("Ingrese su Cedula:");
                    String solicitud = sc.nextLine();
                    Banco info = datos.getDatos().get(solicitud);
                    if(info != null){
                        System.out.println("Su Nuevo Saldo es de: " + info.getSaldo());
                    }else{
                        System.out.println("Usuario no existe");
                    }
                                    
                    break; 
                    case 5:
                    System.out.println("---------------------");
                    System.out.println("Ingrese su Cedula:");
                    String cliente = sc.nextLine();
                    Banco informacion = datos.getDatos().get(cliente);
                    if(informacion != null){
                        System.out.println("Informacion: " + informacion.toString());
                    }else{
                        System.out.println("Usuario no existe");
                    }
                                        
                    break;
                    case 0:
                    System.out.println("---------------------");
                    System.out.println("Fin del Programa");      
                    break;
                    default:
                    System.out.println("Opcion No Valida");
                    }
        }while(opcion != 0);
        sc.close();
    }
}
