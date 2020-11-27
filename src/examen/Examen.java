/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             
           Scanner leer=   new Scanner(System.in);
        
           System.out.println("introduce longitud de cadena");
           String longc= leer.nextLine();
           RSA obj= new RSA(Integer.parseInt(longc));
           obj.generarPrimos();
           obj.generarClaves();
           System.out.println("Estas son tus claves");
           System.out.println("Privada: "+ obj.damed());
           System.out.println("Publica: "+obj.damee());
           System.out.println("Usuario 1: Intrudice mensaje a enviar");
           String mensaje = leer.nextLine();
           System.out.println("Usuario 1: Introduce cadena publica");
           String caca= leer.nextLine();
           BigInteger cad=new BigInteger(caca);
           obj.encriptar(mensaje, cad);
           System.out.println("Usuario 2: recive el mensaje cifrado");
           System.out.println("Encriptado: ");
           for (int i = 0; i < obj.encriptar(mensaje, cad).length; i++) {
               System.out.println(obj.encriptar(mensaje, cad)[i]);
        }
           System.out.println("Usuario 2: introduce cadena privada para descifrar");
           BigInteger cadP = leer.nextBigInteger();
 
           obj.desencriptar(obj.encriptar(mensaje, cad), cadP);
           System.out.println("El mensaje descifrado es: ");
           System.out.println(obj.desencriptar(obj.encriptar(mensaje, cad), cadP));
           
           
           
    }
    
}
