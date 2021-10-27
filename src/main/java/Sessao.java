import java.time.*;
public class Sessao {
    private LocalDateTime objetoData;
    private boolean sessaoLogada;
    private String dataDeInicioDaSessao;

    Sessao() {
        this.sessaoLogada = false;
        objetoData = LocalDateTime.now();
        dataDeInicioDaSessao = objetoData.toString();
    }

    public boolean getSessaoLogada() {
        return this.sessaoLogada;
    }
    public String getDataDeInicioDaSessao() {
        return this.dataDeInicioDaSessao;
    }
}
