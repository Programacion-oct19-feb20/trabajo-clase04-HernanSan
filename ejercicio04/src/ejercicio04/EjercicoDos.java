/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class EjercicoDos {
    /*
    Generara un programa que premita pedir datos por teclado para:
    Ingreso de nombre 
    Ingreso de ciudad de nacimiento
    Ingreso de edad Ingreso de edad
    Ingreso de costo de matricula
    
    Luego presentar en pantalla los datos de la siguiente forma:
    Datos Personales:
    Nombres:   
    Ciudad de nacimiento:
    Edad:
    Matricula:
    */
    public static void main(String[] args) {       
    Scanner entrada = new Scanner(System.in);  
    String nombres;   
    String ciudadDeNacimiento;  
    int edad;   
    double matricula;
    System.out.println("Ingrese sus nombres");
    nombres = entrada.nextLine();
    System.out.println("Ingrese su ciudad de nacimiento");
    ciudadDeNacimiento = entrada.nextLine();
    System.out.println("Ingrese su edad");
    edad = entrada.nextInt(); //Ingreso de entero
    System.out.println("Ingrese su valor de matricula");
    matricula = entrada.nextDouble(); //Ingreso de decimales
    
    System.out.printf("Datos Personales:\nNombres: %s\nCiudad de Nacimiento:"
    + " %s\nEdad: %d\nMatricula: %.2f\n", nombres, ciudadDeNacimiento, edad, matricula);
    //f es para dato decimal, d es para dato  entero
    
    
   
           
               
    }

}
