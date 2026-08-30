public class Videojuego {
    private String id;
    private String titulo;
    private String plataforma;
    private int anioLanzamiento;
    private double puntuacion;

    public Videojuego(String id, String titulo, String plataforma, int anioLanzamiento, double puntuacion) {
        this.id = id;
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.anioLanzamiento = anioLanzamiento;
        this.puntuacion = puntuacion;
    }

    // --- GETTERS ---
    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    // --- SETTERS ---
    public void setId(String id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    // --- TOSTRING ---
    @Override
    public String toString() {
        // Formato limpio para la consola, ej: [WII-001] Super Mario (Wii, 2007) - 9.5/10
        return String.format("[%s] %s (%s, %d) - %.1f/10", 
                id, titulo, plataforma, anioLanzamiento, puntuacion);
    }
}