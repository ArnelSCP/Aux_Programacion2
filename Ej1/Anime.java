class Anime {
    public String nombre;
    public String genero;
    private int nroEpisodios;
    private String[] episodios;

    public Anime(String nombre, String genero, int nroEpisodios) {
        this.nombre = nombre;
        this.genero = genero;
        this.nroEpisodios = nroEpisodios;
        this.episodios = new String[nroEpisodios];
    }
}

public class MainAnime {
    public static void main(String[] args) {
        Anime objeto1 = new Anime("Naruto", "Shonen", 220);
        Anime objeto2 = new Anime("One Piece", "Aventura", 1000);
        
        System.out.println("Animes creados: " + objeto1.nombre + " y " + objeto2.nombre);
    }
}
