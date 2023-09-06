package biblioteca.models.relatorios;

import biblioteca.models.formularios.Multa;

import java.util.List;

public class RelatorioMultas extends Relatorio{
    private List<Multa> multaList;

    public RelatorioMultas(List<Multa> multaList) {
        this.multaList = multaList;
    }

    public List<Multa> getMultaList() {
        return multaList;
    }

    public void setMultaList(List<Multa> multaList) {
        this.multaList = multaList;
    }

    public void addMulta(Multa multa){
        this.multaList.add(multa);
    }
}
