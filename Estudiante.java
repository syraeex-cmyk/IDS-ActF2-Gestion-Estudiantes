public class Estudiante {
    private String nombre;
    private String matricula;
    private String carrera;

    public Estudiante(String nombre, String matricula, String carrera) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public String getNombre() { return nombre; }
    public String getMatricula() { return matricula; }
    public String getCarrera() { return carrera; }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Carrera: " + carrera);
    }
}
