
package nivel0exercicio4;

import java.util.Scanner;


public class Nivel0Exercicio4 {

    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println ("Conversão de Graus Celsius para Fahrenheit:");
     
        System.out.println ("Digite a Temperatura em Graus Celsius:");
        double celsius = leia.nextDouble();
                
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println (fahrenheit+" graus Fahrenheit");

    }
    
}
