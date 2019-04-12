/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete2;

/**
 *
 * @author Personal
 */
public class MiEjemplo2 {
    public static void main(String[] args) {
       // este metodo es el principal de mi clase
       String nombrePersona; // es la variable para almacenar un nombre 
       String apellidoPersona; 
       int edad;
       
       nombrePersona = "Marjan Aldair ";
       apellidoPersona = "Celi Salinas";
       edad = 36;
       //System.out.println("Mi Nombre es :"+nombrePersona+"\n\n\t Mi apellido es:"+apellidoPersona);
       
        System.out.printf("Mi Nombre es : %s\nMi Apellido es :%s\nMi Edad es : %s", 
                nombrePersona, apellidoPersona,edad);
    }
    
}
