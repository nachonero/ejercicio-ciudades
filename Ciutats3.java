
package ciutats;

import java.util.*;


public class Ciutats3 {
    
    public static void main(String[] args) {

        
         
        
        String [] nombres_ciudades= new String[6]; //Creación del Array
        
        nombres_ciudades[0]="Madrid"; //declaración del Array
        nombres_ciudades[1]="Barcelona";
        nombres_ciudades[2]="Malaga";
        nombres_ciudades[3]="Valencia";
        nombres_ciudades[4]="Cadiz";
        nombres_ciudades[5]="Santander";
          
        
        String [] arrayCiutatsModificades= new String [nombres_ciudades.length];   // Creación del nuevo Array dnde se almacenarán los nombres de las ciudades cambiando "a" `pr "4".
        
            
        //Definición de los valores del array, utilizando toLowerCase por si algún nombre empieza por "a" y está escrito en mayúscula, y replaceAll para hacer el cambio de los caracteres
            arrayCiutatsModificades [0]= nombres_ciudades[0].toLowerCase().replaceAll("a","4");
            arrayCiutatsModificades [1]= nombres_ciudades[1].toLowerCase().replaceAll("a","4"); 
            arrayCiutatsModificades [2]= nombres_ciudades[2].toLowerCase().replaceAll("a","4");
            arrayCiutatsModificades [3]= nombres_ciudades[3].toLowerCase().replaceAll("a","4");
            arrayCiutatsModificades [4]= nombres_ciudades[4].toLowerCase().replaceAll("a","4");
            arrayCiutatsModificades [5]= nombres_ciudades[5].toLowerCase().replaceAll("a","4");
            
        System.out.println("Cambiando los caracteres, las ciudades quedan ordenadas alfabeticamente de la siguiente forma:");
            
            for(int i=0; i<arrayCiutatsModificades.length; i++) {  //Establecemos un bucle para que "recorra" el contenido del Array y podamos luego imprimirlo en pantalla
                 
                Arrays.sort(arrayCiutatsModificades); //Se ordenan las ciudades por órden alfabético antes de imprimirlas en consola
                
                System.out.println(arrayCiutatsModificades[i]);       //Impresión en consola
              
            }
    }
}
