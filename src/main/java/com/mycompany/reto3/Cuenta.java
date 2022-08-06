/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto3;

/**
 *
 * @author Jose
 */
public class Cuenta extends Cliente {

    private long cuenta;
    private String fecha;
    private int tipo;
    private double saldo;

    /*
     * public static void main(String[] args) {
     * Cuenta cuenta = new Cuenta();
     * cuenta.setCuenta(123456789);
     * cuenta.setFecha("01/01/2020");
     * cuenta.setTipo(3);
     * cuenta.setSaldo(100);
     * System.out.println(cuenta.toString());
     * System.out.println(cuenta.calcular_interes());
     * }
     */
    public long getCuenta() {
        return cuenta;
    }
    

    public Cuenta(long documento, String nombre, String correo, int celular, String direccion, long cuenta,
            String fecha, int tipo, double saldo) {
        super(documento, nombre, correo, celular, direccion);
        this.cuenta = cuenta;
        this.fecha = fecha;
        this.tipo = tipo;
        this.saldo = saldo;
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // crear metodo calcular_interes
    public double calcular_interes() {
        double vrintereses = 0;
        switch (tipo) {
            case 1:
                vrintereses = saldo * 1.5 / 100;
                break;
            case 2:
                vrintereses = saldo * 1.7 / 100;
                break;
            case 3:
                vrintereses = saldo * 1.6 / 100;
                break;
        }
        return vrintereses;
    }

}
