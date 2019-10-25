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
public class EjercicioTres {
    /*Generara un programa que premita pedir datos por teclado para:
    Ingreso de nombres completo de un estudiante
    Ingreso de nota 1 (debe ser entero)
    Ingreso de nota 2 (debe ser entero)
    Ingreso del ciclo que cursa el alumno (debe ser cadena)
    
    Luego presentar en pantalla los datos de la siguiente forma:
    Informe del alumno
    Nombres Completos:
    Ciclo:
    Nota1:
    Nota2.
    */
    public static void main(String[] args) {       
    Scanner entrada = new Scanner(System.in);
    String nombres;
    int nota1;
    int nota2;
    String ciclo;
    System.out.println("Nombres Completos");
    nombres = entrada.nextLine();
    System.out.println("Nota1");
    nota1 = entrada.nextInt(); 
    System.out.println("Nota2");
    nota2 = entrada.nextInt(); 
    entrada.nextLine();
    System.out.println("Ciclo");
    ciclo = entrada.nextLine();
    System.out.printf("Informe alumno:\nNombres: %s\nCiclo:"
    + " %s\nNota1: %d\nNota2: %s\n", nombres, ciclo, nota1, nota2);
    
}
}