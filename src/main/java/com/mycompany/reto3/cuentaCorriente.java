/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto3;

/**
 *
 * @author Jose
 */
public class cuentaCorriente extends Cliente {
    private long cuenta;
    private String fecha;
    private double saldo;
    private float porcentaje;
    private double sobregiro;

    

    public cuentaCorriente(long documento, String nombre, String correo, int celular, String direccion, long cuenta,
            String fecha, double saldo, float porcentaje, double sobregiro) {
        super(documento, nombre, correo, celular, direccion);
        this.cuenta = cuenta;
        this.fecha = fecha;
        this.saldo = saldo;
        this.porcentaje = porcentaje;
        this.sobregiro = sobregiro;
    }

    public long getCuenta() {
        return cuenta;
    }

    public void setCuenta(long cuenta) {
        this.cuenta = cuenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    public double calcular_interes() {
        double vrintereses = 0;
        vrintereses = saldo * porcentaje / 100;
        return vrintereses;
    }

}
