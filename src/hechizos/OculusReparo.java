package hechizos;

public class OculusReparo implements Hechizo {
    public void ejecutar(String lanzador) {
        System.out.println(lanzador + " repara los anteojos dañados: ¡Oculus reparo!");
    }
    public String getNombre() {
        return "Oculus Reparo";
    }
}