package padroescomportamentais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EscritorioTest {

    Escritorio escritorio;
    Trabalho trabalho;

    @BeforeEach
    void setUp() {
        escritorio = new Escritorio();
        trabalho = new Trabalho("segunda", "08h" );
    }

    @Test
    void deveLigarLuz() {
        Comando ligarluz = new LigarLuzComando(trabalho);
        escritorio.executarTarefa(ligarluz);
        assertEquals("Luz ligada", trabalho.getStatus());
    }

    @Test
    void deveLigarArCondicionado() {
        Comando ligarArCond = new LigarArCondicionadoComando(trabalho);
        escritorio.executarTarefa(ligarArCond);
        assertEquals("Ar condicionado ligado", trabalho.getStatus());
    }

    @Test
    void deveDesligarArCondicionado() {
        Comando ligarluz = new LigarLuzComando(trabalho);
        Comando ligarArCond = new LigarArCondicionadoComando(trabalho);

        escritorio.executarTarefa(ligarluz);
        escritorio.executarTarefa(ligarArCond);

        escritorio.cancelarUltimaTarefa();

        assertEquals("Ar condicionado desligado", trabalho.getStatus());
    }
}