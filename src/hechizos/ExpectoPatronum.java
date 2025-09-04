package hechizos;

public class ExpectoPatronum implements Hechizo {
    public void ejecutar(String lanzador) {
        System.out.println(lanzador + " invoca a un guardián mágico: ¡Expecto Patronum!");
    }
    public String getNombre() {
        return "Expecto Patronum";
    }
}
