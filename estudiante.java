package promedioGrupo;

public class Estudiante {
    private String matricula;
    private String nombre;
    private double estructuras;
    private double evaluacion;
    private double ingles;
    private double promedio;

    //constructor siempre debe ser publico para crear un esrtudiante
    //constructor (metodo para iniciar un objeto de este tipo)
    //getters and setters
    //line 11, 12 son publicos, no las variables
    //ocupamos un getter y setter para poder crear y modificar un objeto
    public Estudiante(String m, String n){
        //el objetivo en construir en inicializar el objeto
        this.matricula = m;
        this.nombre = n;
    }
    //getters y setters
    //get: metodo constructor
    public String getMatricula(){
        return this.matricula;
    }
    //set: metodo modificador
    public void setMatricula(String matric){
        this.matricula = matric;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nom){
        this.nombre = nom;
    }   
    public double getEstructuras(){
        return this.estructuras;
    }       
    public void setEstructuras(double est){
        this.estructuras = est;
    }
    public double getEvaluacion(){
        return this.evaluacion;
    }
    public void setEvaluacion(double eva){
        this.evaluacion = eva;
    }   
    public double getIngles(){
        return this.ingles;
    }
    public void setIngles(double ing){
        this.ingles = ing;
    }
    public double getPromedio(){
        return this.promedio;
    }
    public void setPromedio(){
        this.promedio = (this.estructuras + this.evaluacion + this.ingles)/3;
    }
    @Override
    public String toString(){
        return "Estudiante [matricula=" + matricula + ",nombre" + nombre + ",promedio" + promedio +"]";
    }    

}
