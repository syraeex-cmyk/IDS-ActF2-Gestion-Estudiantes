public class Principal {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(
            "Maribel Garcia Castaneda",
            "MAT-001",
            "Ingenieria en Desarrollo de Software"
        );

        System.out.println("SISTEMA DE GESTION DE ESTUDIANTES");
        System.out.println("--------------------------------");
        estudiante1.mostrarInformacion();
    }
}
