package hechizos;

public class Expelliarmus implements Hechizo {
    public void ejecutar(String lanzador) {
        System.out.println(lanzador + " desarma al oponente: ¡Expelliarmus!");
    }
    public String getNombre() {
        return "Expelliarmus";
    }
}
