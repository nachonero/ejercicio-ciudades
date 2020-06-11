package ciutats;

import java.util.*;

public class Ciutats {

    
    public static void main(String[] args) {
        
        String ciudad_1; //Definición de las variables para las 6 ciudades a ingresar
        String ciudad_2;
        String ciudad_3;
        String ciudad_4;
        String ciudad_5;
        String ciudad_6;
        
        //utilizacion de la clase Scanner para introducir los valores de la variable por consola
        Scanner entrada = new Scanner(System.in); //declaración del constructor
        
            System.out.println("Introduce el nombre de la ciudad 1");
        
        ciudad_1=entrada.nextLine(); //utilización del método nextLine para almacernar las variables, repitiéndolo en las 6 ciudadeds
        
            System.out.println("Introduce el nombre de la ciudad 2");
        
        ciudad_2=entrada.nextLine();
        
            System.out.println("Introduce el nombre de la ciudad 3");
        
        ciudad_3=entrada.nextLine();
        
            System.out.println("Introduce el nombre de la ciudad 4");
        
        ciudad_4=entrada.nextLine();
        
            System.out.println("Introduce el nombre de la ciudad 5");
        
        ciudad_5=entrada.nextLine();
        
            System.out.println("Introduce el nombre de la ciudad 6");
        
        ciudad_6=entrada.nextLine();
        
        //Impresión de las variables introducidas por consola
        System.out.println("las ciudades introducidas son: "+ciudad_1+", " + ciudad_2+", " + ciudad_3+", " + ciudad_4+", " + ciudad_5+" y " + ciudad_6);
    }
    
}
