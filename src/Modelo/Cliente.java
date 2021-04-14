/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author alumnodaw
 */
public class Cliente {
    private String nombre,apellido1,apellido2,estadocivil,sexo;
    private int edad;

    public Cliente(String nombre, String apellido1, String apellido2, String estadocivil, String sexo, int edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.estadocivil = estadocivil;
        this.sexo = sexo;
        this.edad = edad;
    }
    
}

