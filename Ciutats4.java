
package ciutats;

public class Ciutats4 {
    
     public static void main(String[] args) {
    
    
    
    
      String [] nombres_ciudades= new String[6]; //Creación del Array
        
        nombres_ciudades[0]="Barcelona";
        nombres_ciudades[1]="Madrid";
        nombres_ciudades[2]="Valencia";
        nombres_ciudades[3]="Malaga";
        nombres_ciudades[4]="Cadiz";
        nombres_ciudades[5]="Santander";
        
        
        char [] ciudad_1= nombres_ciudades[0].toCharArray(); //Transformación de los valores String dentro del array a Char en un nuevo Array para cada elemento
        
        char aux;                     //Establecimiento de dos nuevas variables + "i" para ejecutar el bucle que invertirá los caracteres del Array 

          int n = ciudad_1.length;
          
          for(int i = 0;i <= n/2; i++){

            aux = ciudad_1[n-1];

             ciudad_1[n-1] = ciudad_1[i];

             ciudad_1[i] = aux;

             n--;

           }

          for (int i = 0; i < ciudad_1.length; i++) // Se recorre el bucle modificado a la inversa para ser imprimido

            System.out.print(ciudad_1[i]); // Impresión del bucle
            System.out.println("");
           
     
        // Este procedimiento se repite para cada una de las ciudades
                 
        
       // Ciudad 2
       
       char [] ciudad_2= nombres_ciudades[1].toCharArray();   
       
       char aux2; 

          int n2 = ciudad_2.length;
          
          for(int i = 0;i <= n/2; i++){

            aux2 = ciudad_2[n2-1];

             ciudad_2[n2-1] = ciudad_2[i];

             ciudad_2[i] = aux2;

             n2--;

           }

          for (int i = 0; i < ciudad_2.length; i++)

            
            System.out.print(ciudad_2[i]); 
            System.out.println("");
       
          // Ciudad 3
          
            
       char [] ciudad_3= nombres_ciudades[2].toCharArray();   
       
       char aux3; 

          int n3 = ciudad_3.length;
          
          for(int i = 0;i <= n/2; i++){

            aux3 = ciudad_3[n3-1];

             ciudad_3[n3-1] = ciudad_3[i];

             ciudad_3[i] = aux3;

             n3--;

           }

          for (int i = 0; i < ciudad_3.length; i++)

            
            System.out.print(ciudad_3[i]); 
            System.out.println("");
            
            
            
           // Ciudad 4
           
       
       char [] ciudad_4= nombres_ciudades[3].toCharArray();   
       
       char aux4; 

          int n4 = ciudad_4.length;
          
          for(int i = 0;i <= n/2; i++){

            aux4 = ciudad_4[n4-1];

             ciudad_4[n4-1] = ciudad_4[i];

             ciudad_4[i] = aux4;

             n4--;

           }

          for (int i = 0; i < ciudad_4.length; i++)

            
            System.out.print(ciudad_4[i]); 
            System.out.println("");    
    
        
        // Ciudad 5
      
       char [] ciudad_5= nombres_ciudades[4].toCharArray();   
       
       char aux5; 

          int n5 = ciudad_5.length;
          
          for(int i = 0;i <= n/2; i++){

            aux5 = ciudad_5[n5-1];

             ciudad_5[n5-1] = ciudad_5[i];

             ciudad_5[i] = aux5;

             n5--;

           }

          for (int i = 0; i < ciudad_5.length; i++)

            
            System.out.print(ciudad_5[i]); 
            System.out.println("");    
    
            
        //Ciudad 6
        
        
       char [] ciudad_6= nombres_ciudades[5].toCharArray();   
       
       char aux6; 

          int n6 = ciudad_6.length;
          
          for(int i = 0;i <= n/2; i++){

            aux6 = ciudad_6[n6-1];

             ciudad_6[n6-1] = ciudad_6[i];

             ciudad_6[i] = aux6;

             n6--;

           }

          for (int i = 0; i < ciudad_6.length; i++)

            
            System.out.print(ciudad_6[i]); 
         
    
    }
    
}