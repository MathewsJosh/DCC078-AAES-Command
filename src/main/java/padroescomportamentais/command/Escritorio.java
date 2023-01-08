package padroescomportamentais.command;

import java.util.ArrayList;
import java.util.List;

public class Escritorio {

    private List<Comando> comandos = new ArrayList<Comando>();

    public void executarTarefa(Comando comando) {
        this.comandos.add(comando);
        comando.ligar();
    }

    public void cancelarUltimaTarefa() {
        if (comandos.size() != 0) {
            Comando comando = this.comandos.get(this.comandos.size() - 1);
            comando.desligar();
            this.comandos.remove(this.comandos.size() - 1);
        }
    }

}
