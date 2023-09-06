package biblioteca.models.relatorios;



public class RelatorioDisponibilidade extends Relatorio{
    private int CDDisp;
    private int DVDDisp;
    private  int EbookDisp;
    private int livroDisp;

    public RelatorioDisponibilidade(int CDDisp, int DVDDisp, int ebookDisp, int livroDisp) {
        this.CDDisp = CDDisp;
        this.DVDDisp = DVDDisp;
        EbookDisp = ebookDisp;
        this.livroDisp = livroDisp;
    }

    public int getCDDisp() {
        return CDDisp;
    }

    public void setCDDisp(int CDDisp) {
        this.CDDisp = CDDisp;
    }

    public int getDVDDisp() {
        return DVDDisp;
    }

    public void setDVDDisp(int DVDDisp) {
        this.DVDDisp = DVDDisp;
    }

    public int getEbookDisp() {
        return EbookDisp;
    }

    public void setEbookDisp(int ebookDisp) {
        EbookDisp = ebookDisp;
    }

    public int getLivroDisp() {
        return livroDisp;
    }

    public void setLivroDisp(int livroDisp) {
        this.livroDisp = livroDisp;
    }
}
