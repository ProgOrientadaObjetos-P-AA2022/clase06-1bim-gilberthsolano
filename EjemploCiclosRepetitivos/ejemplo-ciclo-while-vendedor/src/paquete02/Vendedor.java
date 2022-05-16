/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

public class Vendedor {
    private String nombres;
    private int edad;
    private double pagoMensual;
    private double salarioMinimo;
    private int numeroAutos;
    private double comisionPorAuto;
    
    
    public Vendedor(String n, int e, double sMinimo, int nAutos){
        nombres = n;
        edad = e;
        salarioMinimo = sMinimo;
        establecerNumeroAutos(nAutos);
        comisionPorAuto = 150;
    }
    public void establecerNombres(String c){
        nombres = c;
    }
    
    public void establecerEdad(int c){
        edad = c;
    }
    
    public void calcularPagoMensual(){
        pagoMensual = obtenerSalarioMinimo() + 
                (obtenerComisionPorAuto() * obtenerNumeroAutos());
    }
    
    public void establecerSalarioMinimo(double s){
        salarioMinimo = s;
    }
    
    public void establecerNumeroAutos(int s){
        numeroAutos = s;
    }
    
    // comisionPorAuto;
    public void establecerComisionPorAuto(double s){
        comisionPorAuto = s;
    }
    
    public String obtenerNombres(){
        return nombres;
    }
    
    public int obtenerEdad(){
        return edad;
    }
    
    public double obtenerPagoMensual(){
        return pagoMensual;
    }
    
    public double obtenerSalarioMinimo(){
        return salarioMinimo;
    }
    
    public int obtenerNumeroAutos(){
        return numeroAutos;
    }
    
    public double obtenerComisionPorAuto(){
        return comisionPorAuto;
    }
     public String toString() {
        String cadena = String.format("Nombres: %s\n"
                + "Edad: %d\n"
       
                + "Pago mensual: %.2f\n"
                + "Salario Minimo %.2f\n"
                + "Numero de autos: %d\n"
                +"Comision por auto: %.2f\n", obtenerNombres(), 
                obtenerEdad(), 
                obtenerPagoMensual(), 
                obtenerSalarioMinimo(),
                obtenerNumeroAutos(),
                obtenerComisionPorAuto()
                );
        return cadena;
    }
}
