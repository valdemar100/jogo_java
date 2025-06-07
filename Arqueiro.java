public class Arqueiro extends Personagem {
    private String tipodeflecha;

    public Arqueiro(String nome, int nivel, String tipodeflecha) {
        super(nome, nivel);
        this.tipodeflecha = tipodeflecha;
    }

    public String getTipoFlecha() {
        return tipodeflecha;
    }

    @Override
    public String toString() {
        return "Arqueiro - Nome: " + getNome() + ", Nível: " + getNivel() + ", Quantidade de Flechas: " + tipodeflecha;
    }
}
