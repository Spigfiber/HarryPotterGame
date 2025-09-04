package hechizos;

public class SinHechizo implements Hechizo {
    public void ejecutar(String lanzador) {
        System.out.println(lanzador + " no tiene un hechizo asignado por ahora.");
    }
    public String getNombre() {
        return "SinHechizo";
    }
}