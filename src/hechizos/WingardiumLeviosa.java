package hechizos;

public class WingardiumLeviosa implements Hechizo {
    public void ejecutar(String lanzador) {
        System.out.println(lanzador + " hace levitar el objeto: ¡Wingardium leviosa!");
    }
    public String getNombre() {
        return "Wingardium Leviosa";
    }
}