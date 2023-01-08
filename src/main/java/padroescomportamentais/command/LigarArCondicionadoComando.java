package padroescomportamentais.command;

public class LigarArCondicionadoComando implements Comando {

    private Trabalho trabalho;

    public LigarArCondicionadoComando(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

    public void ligar() {
        this.trabalho.ligarArCondicionado();
    }

    public void desligar() {
        this.trabalho.desligarArCondicionado();
    }
}
