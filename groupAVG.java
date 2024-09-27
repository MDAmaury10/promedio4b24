//programa que calcula el promedio de un grupo
//calcular el promedio de un grupo
//se lee el tamaño del grupo
//se leen n calificaciones
//se suman
//se dividen entre 'n'

package promedioGrupo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class groupAVG {
    public static void main(String[] args) throws IOException{
        int N;//tamaño del arreglo
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double []calificaciones;//arreglo de calificaciones
        double suma = 0;//para sumas calificaciones
        double promedio;//el promedio del grupo

        
        System.out.println("Programa que calcula el promedio de un grupo");
        System.out.println("Escribe el tamaño del grupo: ");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);

        //constrimos el areglo de calificaciones
        calificaciones = new double[N];
        //leer las calificaciones de cada alumno
        for(int i=0; i<calificaciones.length; i++){
            System.out.println("Escribe la calificacion del alumno " + (i+1) + ": ");
            entrada = bufer.readLine();
            calificaciones[i] = Double.parseDouble(entrada);
            suma += calificaciones[i];
        }
        promedio = suma/N;
        System.out.println("Las calificaciones del grupo son: ");
        for(int i=0; i<calificaciones.length; i++){
            System.out.println(calificaciones[i]);
        }

        System.out.println("El promedio del grupo es: " + promedio);
        
    }
    
}
