package padroescomportamentais.command;

public class Trabalho {

    private String dia;
    private String horario;
    private String status;

    public Trabalho(String dia, String horario) {
        this.dia = dia;
        this.horario = horario;
    }

    public String getStatus() {
        return status;
    }

    public void acenderLuz() {
        this.status = "Luz ligada";
    }

    public void apagarLuz() {
        this.status = "Luz desligada";
    }

    public void ligarArCondicionado() {
        this.status = "Ar condicionado ligado";
    }

    public void desligarArCondicionado() {
        this.status = "Ar condicionado desligado";
    }
}
