
package ciutats;

import java.util.*;

public class Ciutats2 {
    
    public static void main(String[] args) {
       
              
        String ciudad_1;
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
        
         //Hasta aquí Idem consigna 1
        
        String [] nombres_ciudades= new String[6]; //Creación del Array
        
        nombres_ciudades[0]=ciudad_1; //declaración del Array
        nombres_ciudades[1]=ciudad_2;
        nombres_ciudades[2]=ciudad_3;
        nombres_ciudades[3]=ciudad_4;
        nombres_ciudades[4]=ciudad_5;
        nombres_ciudades[5]=ciudad_6;
        
           System.out.println("Las ciudades por órden alfabético son: ");
          
           for(int i=0; i<nombres_ciudades.length; i++) {
         //Establecemos un bucle para que "recorra" el contenido del Array y podamos luego imprimirlo en pantalla
                     
            Arrays.sort(nombres_ciudades); //Antes de que lo imprima, utilizamos el método sort para ordenar los nombres de las ciudades alfabeticamente
            
            System.out.println(nombres_ciudades[i]); //Imprimimos los nombres de las ciudades
            
           }
        
    }
    
}
