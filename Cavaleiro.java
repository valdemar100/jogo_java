public class Cavaleiro extends Personagem {
    private String montaria;

    public Cavaleiro(String nome, int nivel, String montaria) {
        super(nome, nivel);
        this.montaria = montaria;
    }

    public String getMontaria() {
        return montaria;
    }

    @Override
    public String toString() {
        return "Cavaleiro - Nome: " + getNome() + ", Nível: " + getNivel() + ", Montaria: " + montaria;
    }
}
