package padroescomportamentais.command;

public class LigarLuzComando implements Comando {

    private Trabalho trabalho;

    public LigarLuzComando(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

    public void ligar() {
        this.trabalho.acenderLuz();
    }

    public void desligar() {
        this.trabalho.apagarLuz();
    }
}
