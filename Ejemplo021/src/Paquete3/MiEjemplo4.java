
package Paquete3;

import java.util.Scanner;

public class MiEjemplo4 {
    public static void main(String[] args) {
        String nombre;
        String apellido;
        String ciudad;
        int edad;
        double nota1;
        double nota2;
        double promedio;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese su apellido");
        apellido = sc.nextLine();
        
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        
        System.out.println("Ingrese la Nota 1");
        nota1 = sc.nextDouble();
        
        System.out.println("Ingrese la Nota 2");
        nota2 = sc.nextDouble();
           
        promedio = (nota1 + nota2) /2 ;
        
        sc.nextLine(); // Limpieza del buffer
        
        System.out.println("Ingrese su ciudad ");
        ciudad = sc.nextLine();
        
        System.out.printf("Mi Nombre es : %s\nMi Apellido es :%s\nMi Edad es : "
                + "%d años \nMi Notas son de %.2f y %.2f \nMi promedio es de :%.3f \nVive en la ciudad de : %s "
                ,nombre, apellido, edad, nota1, nota2, promedio, ciudad);
        
        
        
      
        
       
        
        
    }
    
}
