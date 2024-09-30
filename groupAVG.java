package promedioGrupo;

//programa que calcula el promedio de un grupo
//calcular el promedio de un grupo
//se lee el tamaño del grupo
//se leen n calificaciones
//se suman
//se dividen entre 'n'



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 //Areglo de un tipo de dato abstracto (TDA)
 public class groupAVG {
 public static Estudiante[] estudiantes;
 public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
 public static String entrada;

 public static void leer_estudiantes() throws IOException{
    String matricula, nombre;
    for(int i=0; i<estudiantes.length; i++){
        System.out.println("-----------------------");
        System.out.println("Información del estudiante [" + (i+0) +"]");
        System.out.println("Matricula");
        entrada = bufer.readLine();
        matricula = entrada;
        System.out.println("Nombre");
        entrada = bufer.readLine();
        nombre = entrada;
        Estudiante e = new Estudiante(matricula, nombre);
        System.out.println("Escriba la calificación de estructuras: ");
        entrada = bufer.readLine();
        e.setEstructuras(Double.parseDouble(entrada));
        System.out.println("Escriba la calificación de Evaluación: ");
        entrada = bufer.readLine();
        e.setEvaluacion(Double.parseDouble(entrada));
        System.out.println("Escriba la calificación de Ingles: ");
        entrada = bufer.readLine();
        e.setIngles(Double.parseDouble(entrada));
        e.setPromedio();
        estudiantes[i] = e;//agregamos un objeto Estudiante al arreglo
    }
 }



    public static void main(String[] args) throws IOException{
        int N;//tamaño del arreglo
       
       
        //Arreglo de tipo de dato primitivo(double)
        double []calificaciones;//arreglo de calificaciones
        double suma = 0;//para sumas calificaciones
        double promedio;//el promedio del grupo

        
        System.out.println("Programa que calcula el promedio de un grupo");
        System.out.println("Escribe el tamaño del grupo: ");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);

        //construyendo el arreglo de estudiantes
        estudiantes = new Estudiante[N];

        //constrimos el areglo de calificaciones
        calificaciones = new double[N];
        //leer las calificaciones de cada alumno
        // for(int i=0; i<calificaciones.length; i++){
        //     System.out.println("Escribe la calificacion del alumno " + (i+1) + ": ");
        //     entrada = bufer.readLine();
        //     calificaciones[i] = Double.parseDouble(entrada);
        //     suma += calificaciones[i];
        // }
        // promedio = suma/N;





        System.out.println("Las calificaciones del grupo son: ");
        for(int i=0; i<calificaciones.length; i++){
            System.out.println(calificaciones[i]);
        }

        System.out.println("El promedio del grupo es: " + promedio);
        
    }
    
}
