package personajes;

import hechizos.Hechizo;
import hechizos.SinHechizo;

public abstract class Personaje {
    private final String nombre;
    private Hechizo hechizo;

    protected Personaje(String nombre, Hechizo hechizoInicial) {
        this.nombre = nombre;
        this.hechizo = (hechizoInicial != null) ? hechizoInicial : new SinHechizo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setHechizo(Hechizo nuevoHechizo) {
        this.hechizo = (nuevoHechizo != null) ? nuevoHechizo : new SinHechizo();
        System.out.println(">> " + nombre + " ahora usará: " + this.hechizo.getNombre());
    }

    public void performHechizo() {
        hechizo.ejecutar(nombre);
    }
}
