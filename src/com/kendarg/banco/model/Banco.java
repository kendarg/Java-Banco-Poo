package com.kendarg.banco.model;

public class Banco {
    private String nombre;
    private String cedula;
    private String tipoCuenta;
    private int numeroCuenta;
    private double saldo = 0.0;
    private String correo;
    
    public Banco(String nombre, String cedula, String correo, String tipoCuenta,  double saldo){
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }
    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getCedula(){
        return cedula;
    }
    public String getTipoCuenta(){
        return tipoCuenta;
    }
    public String getCorreo(){
        return correo;
    }
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    //Setter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    //2. Depositar Dinero
    public void depositar(double monto){
        if(monto > 0){
            saldo += monto;
        }
    }

    //3. Retirar Dinero
    public void retiro(double monto){
        if(saldo == 0){
            saldo = 0;
            
        }else if(saldo >0){
            if(monto > 0){
                saldo -= monto;
            }
        }
    }


    //toSet
    @Override
    public String toString(){
        return "[ " + 
        "Nombre del Cliente: " + nombre +
        ", Documento: " + cedula +
        ", Tipo de Cuenta: " + tipoCuenta +
        ", Numero de Cuenta: " + numeroCuenta +
        ", Saldo: " + saldo + 
        " ]"
        ;
    }
    


}
