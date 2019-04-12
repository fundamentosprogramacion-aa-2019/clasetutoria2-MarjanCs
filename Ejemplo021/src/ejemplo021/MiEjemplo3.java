package ejemplo021;

import java.util.Scanner;

public class MiEjemplo3 {

    public static void main(String[] args) {
        // este metodo es el principal de mi clase
        String nombrePersona; // es la variable para almacenar un nombre 
        String apellidoPersona;
        String ciudad;
        int edad;
        
        Scanner entrada = new Scanner(System.in); // Me Permite ingresar info
        
        System.out.println("Ingrese su nombre ");
        nombrePersona = entrada.nextLine();
        
        System.out.println("Ingrese su apellido");
        apellidoPersona = entrada.nextLine();
                
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine(); // esto es una limpieza de mi buffer de entrada
        
        System.out.println("En que ciudad vive");
        ciudad = entrada.nextLine();
        
        System.out.printf("Mi Nombre es : %s\nMi Apellido es :%s\nMi Edad es : "
                + "%s años \nVive en la ciudad de : %s ",nombrePersona, apellidoPersona, edad,ciudad);
    }

}
