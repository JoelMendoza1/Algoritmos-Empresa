/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dias, cont=0, horas, TotalHoras = 0,Htrabxdia=0;
	float Sueldo, SueldoSem;
	Scanner s= new Scanner(System.in);
        System.out.println("Escriba el sueldo que va ganar por hora");
	Sueldo=s.nextFloat();
	do{
		dias=cont+1;
                System.out.println("Ingrese el numero de horas trabajadas el dia: "+dias);
		Htrabxdia=s.nextInt();
		TotalHoras=TotalHoras+Htrabxdia;
		cont++;
	}while(dias<5);
	
	SueldoSem=TotalHoras*Sueldo;
        System.out.println("El sueldo semanal es: "+SueldoSem);
	
    }
    
}
