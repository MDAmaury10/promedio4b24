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

 public static void leerEstudiantes() throws IOException{
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

    public static void imprimirEstudiantes(){
        for (Estudiante e : estudiantes){
            System.out.println(e.toString());
        }
    }
    
    public static double calcularPromedioGrupo(){
        double suma = 0;
        for(Estudiante e : estudiantes){
            suma += e.getPromedio();
        }

        return suma/estudiantes.length;
    }

    public static void main(String[] args) throws IOException{
        int N;//tamaño del arreglo
       

        double promedio;//el promedio del grupo

        
    

        //construyendo el arreglo de estudiantes
        estudiantes = new Estudiante[N];
        //lectura de la informacionde los estudiantes
        leer_estudiantes();
        imprimir_estudiantes();

        //Calcular promedio de grupo
        promedio=calularPromedioGrupo();


        //imprimir el comtenido del arreglo estudiantes
        System.out.println(estudiantes);   
        //constrimos el areglo de calificaciones
        calificaciones = new double[N];
      


       System.out.println("El promedio del grupo es: " + promedio);
        
    }
    
}


//TDA = TIPO DE DATO ABSTRACTO