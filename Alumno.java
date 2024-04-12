public class Alumno {
    private int edad;
    private int nota;

    public Alumno(int edad, int nota){
        this.edad = edad;
        this.nota = nota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int devolverAnios(){
        return edad;
    }
}
