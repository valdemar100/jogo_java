public class Mago extends Personagem {
    private String elemento;

    public Mago(String nome, int nivel, String elemento) {
        super(nome, nivel);
        this.elemento = elemento;
    }

    public String getElemento() {
        return elemento;
    }

    @Override
    public String toString() {
        return "Mago - Nome: " + getNome() + ", Nível: " + getNivel() + ", Elemento: " + elemento;
    }
}
