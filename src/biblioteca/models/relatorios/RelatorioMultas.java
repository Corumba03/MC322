package biblioteca.models.relatorios;

import biblioteca.models.formularios.Multa;

import java.util.List;

public class RelatorioMultas extends Relatorio{
    private List<Multa> listaMulta;

    public RelatorioMultas(List<Multa> listaMulta) {
        this.listaMulta = listaMulta;
    }

    public List<Multa> getMultaList() {
        return listaMulta;
    }

    public void setMultaList(List<Multa> listaMulta) {
        this.listaMulta = listaMulta;
    }

    public void addMulta(Multa multa){
        this.listaMulta.add(multa);
    }
}
